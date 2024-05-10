import java.util.*;


public class App {

    public static final int anoAtual = 2024;
    public static void main(String[] args){
        Scanner SCAN = new Scanner(System.in);

        System.out.println(String.format(
            "Ate o final de 2024 voce tera %s anos",
            CalcularIdade(Integer.parseInt(SCAN.nextLine()))
        ));
    }
    
    public static int CalcularIdade(int anoNascimento)
    {
       
        return anoAtual - anoNascimento;

    }
}