import java.util.*;
import java.util.Scanner; 

public class EX01 {
  private static final Scanner SCAN = new Scanner(System.in);


    public static void main(String[] args) {
      int n = SCAN.nextInt(); 
      /// ou usar int n = SCAN.parseInt(SCAN.nextLine());
      for(int i = n ; i >= 0 ; i--){
      System.out.println(i);
      }
  }
}