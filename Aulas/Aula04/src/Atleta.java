
Class Atleta {
    String nome;  
    String esporte;
    char genero;
    int idade;
    int altura;
    double peso;  
    int velocidade;
    boolean estaTreinado;  

    public void Socar(){
        System.out.println("PORRADAO")
    }

    public void Correr(){
        if(velocidade > 5 ){
            System.out.println("Correu DEMAIS!!!;");
        }else{
            System.out.println("Andou rápido;");
        }
    }
}




