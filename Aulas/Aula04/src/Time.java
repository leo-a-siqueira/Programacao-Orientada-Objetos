public Class time{
    String nome;
    boolean tem_estadio;    
    String estadio;    
    String pais_origem;
    String cidade;
    String estado;
    int fundacao;
    int torcida;
    Arraylist<Atleta> atletas = new Arraylist<>();
    Atleta capitao;
}

public boolean verificarTimeEhForte(){
    int quantidadeAtletasTreinados = 0;

    for(Alteta atleta : atletas){
        if(estaTreinado){
           quantidadeAtletasTreinados++; 
        }
    }

    return quantidadeAtletasTreinados >(atleta / 2)
}