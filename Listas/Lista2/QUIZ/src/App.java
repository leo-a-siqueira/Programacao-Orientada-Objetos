import java.util.*;

public class App {

    private static final int numero_perguntas = 3;
    private static String[] Respostas = new String[numero_perguntas];
    private static String[] Gabarito = new String[numero_perguntas];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args){
        String nomeJogador = Receber_Nome();       
        Comecar_Quiz(nomeJogador);

        Pergunta_1();
        Pergunta_2();
        Pergunta_3();

        Exibir_Resultado(nomeJogador);

        Agradecimento(nomeJogador);
        
    }

    public static String Formatar_Nome(String nome){
        if(nome.isBlank()){
            return "Convidado";
        }
        else{
            nome = nome.trim();
            String[] nomeCompleto = nome.split(" ");
            String primeiroNome = nomeCompleto[0];
            String primeiraLetraNome = String.valueOf(primeiroNome.charAt(0));
            String primeiroNomeSemInicial = primeiroNome.substring(1);
            return primeiraLetraNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();        
        }
    }

    public static String Receber_Nome(){
        System.out.println(
            """
                Seja Bem vindo ao Quiz da Copa Do Mundo!
                Digite seu nome abaixo para começar: 
            """
        );
        
        return Formatar_Nome(SCAN.nextLine());
    }

    public static boolean Validador_Resposta(String resposta){
        if(resposta.isBlank()){
            System.out.println("""
                    Sua resposta não pode ser vázia.
                    Favor informe uma resposta válida.

                    """);
            return false;
        }
        
        return true;     
      
    }

    public static void Comecar_Quiz(String nomeJogador){
        System.out.println(String.format(
            """

            Vamos começar %s!!!  
            Você recebera %s perguntas, tendo cada uma delas 3 alternativas.
            Você deve responder digitando apenas a letra da alternativa e pressionar ENTER.
            Ao final vamos descobrir se você entende mesmo de futebol e copa do mundo :)         

            Aperte Enter para começar.                    
                    """,nomeJogador, numero_perguntas
        ));
        SCAN.nextLine();
    }

    public static void Pergunta_1(){
        String resposta = "";
        do{
            System.out.println(
                """            
                    Em qual ano aconteceu a primeira copa do mundo? 

                    A - 1930
                    B - 1924
                    C - 1940                        
                        """
            );
            resposta = SCAN.nextLine();

        }while(!Validador_Resposta(resposta));

        Gabarito[0] = "A";
        Respostas[0] = resposta;
    }

    public static void Pergunta_2(){
        String resposta = "";
        do{
            System.out.println(
                """

                    Qual foi a última seleção a ganhar a copa do mundo? 

                    A - Alemanhã
                    B - França
                    C - Argentina                        
                        """
            );
            resposta = SCAN.nextLine();

        }while(!Validador_Resposta(resposta));

        Gabarito[1] = "C";
        Respostas[1] = resposta;
    }

    public static void Pergunta_3(){
        String resposta = "";
        do{
            System.out.println(
                """

                    Qual a seleção que mais ganhou a copa do mundo? 

                    A - Argentina
                    B - Brasil
                    C - Italia                        
                        """
            );
            resposta = SCAN.nextLine();

        }while(!Validador_Resposta(resposta));

        Gabarito[2] = "B";
        Respostas[2] = resposta;
    }


    public static void Exibir_Resultado(String nomeJogador){
        System.out.println(String.format(
            """

            %s, Vamos ver se você entende de futebol mesmo!
            Veja as perguntas que você acertou:
            """,
        nomeJogador));

        for( int i = 0 ; i < numero_perguntas; i++){
            System.out.println(String.format(
               
                "%s - %s",               
                (i + 1),
                 Respostas[i].equalsIgnoreCase(Gabarito[i]) ? "ACERTOU" : "ERROU"  
                       
            ));
        }
    }

    public static void Agradecimento(String nomeJogador){
        System.out.println(String.format(
            """ 

            %s agradeçomos sua participação!            
            Até próxima!   
            VAMOS BRASIL!!!           
            """,
            nomeJogador
            ));
    }

    
}