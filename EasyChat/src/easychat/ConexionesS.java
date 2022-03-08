
package easychat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class ConexionesS extends Thread {
    
    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 8000;
    
    //Constructor Host
    public ConexionesS(){
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
  /*  
   //Construcotr cliente
    public ConexionesS(String ip){
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
    }*/
    
    
    
    public void run(){
         try{
            String text;
            while(true){
                text = this.entrada.readLine();
                System.out.println(text);
                EasyChat.ventanaS.bandejaEntrada.setText(EasyChat.ventanaS.bandejaEntrada.getText() + "\n" + text);
            }
        }catch(IOException e){
            System.out.println("Error conexion " + e.getMessage());
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
            return this.entrada.readLine();
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
