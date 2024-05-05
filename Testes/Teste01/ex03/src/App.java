import java.util.*; 

public class Main {
    
    private static final String usuario = "admin";
    private static final String senha = "senha123";    
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {  


      if(Login(Receber_Usuario(), Receber_Senha())){
        System.out.println("Login realizado com sucesso!");
      }
      else{
        System.out.println("Falha no login");
      }
   
  }
  
  static String Receber_Usuario(){
    
    return SCAN.nextLine();    
  }

  static String Receber_Senha(){
    
    return SCAN.nextLine();    
  }

  static boolean Login(String usuario_recebido, String senha_recebida)
  {
    return usuario.equals(usuario_recebido) && senha.equals(senha_recebida);
  }

  
}