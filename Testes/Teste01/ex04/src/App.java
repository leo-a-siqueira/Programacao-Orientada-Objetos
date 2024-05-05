import java.util.*; 

public class Main {
    
    private static final int Quantidade_Convidados = 10;
    private static String[] Lista_Convidados = new String[Quantidade_Convidados];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {  
      Preencher_Lista(Lista_Convidados);
      Buscar_requisitante(SCAN.nextLine()); 
  }
  
  static void Preencher_Lista(String[] Lista){   

    for(int i = 0 ; i < Lista.length ; i++){
      Lista[i] = SCAN.nextLine();
    }   
    Lista_Convidados = Lista;
     
  }

  static void Buscar_requisitante(String requisitante) {    
    boolean esta_na_lista = false;
    for(int i = 0; i < Lista_Convidados.length ; i ++){       
      if(!esta_na_lista){
        esta_na_lista = Lista_Convidados[i].equals(requisitante);
      }
    }
    
    if(esta_na_lista) {
      System.out.println("Requisitante esta na lista. Seja bem vindo!");
    }
    else {
      System.out.println("Requisitante nao esta na lista");
    }
    
  }
}
