import java.util.*;
 

public class Main {

    private static int numero = 0;

    public static void main(String[] args) {
      numero = Receber_Numero();
      Imprimir_Tabuada();
  }
  
  static int Receber_Numero(){
    Scanner SCAN = new Scanner(System.in);
    return Integer.parseInt(SCAN.nextLine());    
  }

   static void Imprimir_Tabuada(){
     for(int i = 1 ; i <= 10 ; i++){
       System.out.println(numero + " x " + i + " = " + (numero * i));
     }
   }
  
}