import java.util.*;

public class App {

    private static final Scanner SCAN = new Scanner(System.in);

    private static void preencherVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    private static boolean buscar_no_vetor(int[] vetor) {
        int numero = Integer.parseInt(SCAN.nextLine());
        boolean validador = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                validador = true;
                break;
            }
        }
        return validador;
    }

    public static void main(String[] args) {

        int tamanho_vetor = 10;
        final int[] vetor = new int[tamanho_vetor];

        preencherVetor(vetor);

        boolean validar = (buscar_no_vetor(vetor));

        if (validar == true) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }

    }

}