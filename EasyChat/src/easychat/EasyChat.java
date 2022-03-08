
package easychat;


public class EasyChat {

   public static ConexionesS servidor;
   public static ConexionesC cliente;
   public static UsuarioMenu frame;
   public static VServer ventanaS;
   public static VCliente ventanaC;
   
   
   
    public static void main(String[] args) {
       
      //Inicializamos programa
      frame = new UsuarioMenu();
      frame.setVisible(true);
      String Usuario = frame.txtUsuario.getText();
    }
    
    public static void initServer(){
      servidor = new ConexionesS();
      servidor.start();
    }
    public static void initCliente(String ip){
      cliente = new ConexionesC(ip);
      cliente.start();
    }
}
