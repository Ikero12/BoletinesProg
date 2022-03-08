
package easychat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionesC extends Thread {
    
    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 8000;
    
    //Constructor Host
    public ConexionesC(){
        try{
            String text;
            //Genera servidor, Genera conexión cuando cliente se conecte con servidor
            ss= new ServerSocket(puerto);   
            s= ss.accept();                  
            
            //Entrada de datos para la lectura de mensajes
            entradaSocket = new InputStreamReader(s.getInputStream());
            entrada = new BufferedReader(entradaSocket);                
            //Salida de dator para el envio de mensajes
            salida = new DataOutputStream(s.getOutputStream());
            
        }catch(IOException e){
            System.out.println("Error conexion " + e.getMessage());
        }
    }
    
   //Construcotr cliente
    public ConexionesC(String ip){
        try{ 
            
            s = new Socket(ip, this.puerto);
            //Entrada de datos para la lectura de mensajes
            entradaSocket = new InputStreamReader(s.getInputStream());
            entrada = new BufferedReader(entradaSocket);                
            //Salida de dator para el envio de mensajes
            salida = new DataOutputStream(s.getOutputStream());
            this.salida.writeUTF("Conectado \n");
            
            
        }catch(IOException e){
            System.out.println("Error conexion " + e.getMessage());
        }
    }
    
    public void run(){
       String text;
       while(true){ 
       try{
            text = this.entrada.readLine();
            EasyChat.ventanaC.bandejaEntrada.setText(EasyChat.ventanaC.bandejaEntrada.getText() + "\n" + text);
        }catch(IOException e){
            System.out.println("Error lectura mensaje " + e.getMessage());
        } 
       }
    }
    
   
    
    
    
    
    public void enviarMensaje(String msg){
        try{
            salida.writeUTF(msg+"\n");
        }catch(IOException e){
            System.out.println("Error envio mensaje " + e.getMessage());
        }
    }
    
    public String leerMensaje(){
        try{
            return entrada.readLine();
        }catch(IOException e){
            System.out.println("Error lectura mensaje " + e.getMessage());
        }
        return null;
    }
    
    
    public void desconectar (){
        try {
            s.close();
        } catch (IOException ex) {
            System.out.println("Error desconexion cliente " + ex.getMessage());
        }
        try{
            ss.close();
        }catch(IOException ex){
            System.out.println("Error desconexion servidor "+ex.getMessage());
        }
}
    
    
    
    
    
    
    
}
