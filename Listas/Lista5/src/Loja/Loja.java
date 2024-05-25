package Loja;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private String endereco;
    ArrayList<Produto> produtos = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        
    }
    
 

}
