import java.util.*;


public class App {

    public static void main(String[] args){
        Scanner SCAN = new Scanner(System.in);

        String palavra1 = SCAN.nextLine();
        String palavra2 = SCAN.nextLine();

        Comparar_Nomes(palavra1, palavra2);
      
    }
    
    public static void Comparar_Nomes(String palavra1, String palavra2){
        if(palavra1.equals(palavra2)){
            System.out.println("As palavras sao identicas");
        }
        else if(palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        }
        else{
            System.out.println("As palavras sao diferentes");
        }
    }

}