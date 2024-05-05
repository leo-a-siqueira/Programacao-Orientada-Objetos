import java.util.*; 

public class Main {    

    public static void main(String[] args) {   

        if(Eh_Par(Receber_Numero())){
            System.out.println("Eh par");
        }
        else{
            System.out.println("Nao eh par");
        }       
   
  }
  
  static int Receber_Numero(){
    Scanner SCAN = new Scanner(System.in);
    return Integer.parseInt(SCAN.nextLine());    
  }

  static boolean Eh_Par(int numero_teste)
  {
    return (numero_teste % 2 == 0);
  }
  
}