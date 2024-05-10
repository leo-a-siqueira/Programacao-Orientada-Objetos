import java.util.*;

public class App {

    private static final int quandtidade_criticos = 3;
    private static Scanner SCAN = new Scanner(System.in);
    public static int[] notas = new int[quandtidade_criticos];
    public static void main(String[] args){
        Receber_Notas();
        Imprimir_Media();
    }
    
    public static void Receber_Notas(){
        for(int i = 0 ; i < notas.length; i++){
            notas[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static void Imprimir_Media(){
        int soma = 0; 
        
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];           
        }
        System.out.println(soma/quandtidade_criticos);
    }
}