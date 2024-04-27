import java.util.*;

public class App {

    private static final Scanner SCAN = new Scanner(System.in);

    private static void preencher_matriz(boolean[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = false;
            }
        }
    }

    private static void ativar_torre(boolean[][] matriz, int coordenadas1, int coordenadas2) {
        matriz[coordenadas1][coordenadas2] = true;
    }

    private static void imprimir_matriz(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                if (matriz[i][j] == false) {
                    System.out.print("X|");
                } else {
                    System.out.print("O|");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int tamanho_matriz = 4;
        final boolean[][] matriz = new boolean[tamanho_matriz][tamanho_matriz];

        preencher_matriz(matriz);

        int coordenadas1 = Integer.parseInt(SCAN.nextLine());
        int coordenadas2 = Integer.parseInt(SCAN.nextLine());

        ativar_torre(matriz, coordenadas1, coordenadas2);

        imprimir_matriz(matriz);
        
    }

}