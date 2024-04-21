import java.util.*;

public class Main {
  
  private static final Scanner SCAN = new Scanner(System.in);
  private static final int n_vagoes = 12;
  private static final int peso_maximo_vagoes = 50; 
  
  
    public static void main(String[] args) {
     int[] vagao = new int[n_vagoes];
     
     carregarVagoes(vagao);
     verificarVagoes(vagao);
  }
  public static void carregarVagoes(int[] trem){
     
      for (int i = 0 ; i < trem.length ; i++){
        trem[i] = Integer.parseInt(SCAN.nextLine());
      }
  }
  
    public static void verificarVagoes(int[] trem){
     
      for (int i = 0 ; i < trem.length ; i++){
        if(trem[i] > peso_maximo_vagoes){
          System.out.println((i+1) + "° vagao ultrapassou o limite de peso");
        }
      }
  }
  
}