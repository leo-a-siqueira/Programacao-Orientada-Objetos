package biblioteca;

import java.util.ArrayList;

public class Biblioteca{
    private String nome;
    private String endereco;
    private ArrayList<Livro> livro = new ArrayList<>();


    public void SetNome(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return this.nome;        
    }
    
    public void SetEndereco(String nome){
        this.endereco = endereco;
    }
    public String GetEndereco(){
        return this.endereco;
    }


}