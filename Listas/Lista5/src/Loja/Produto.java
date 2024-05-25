package Loja;

public class Produto {
    private String marca;
    private String nome;
    private double preco;    

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public Produto(String marca, String nome, double preco) {
        this.marca = marca;
        this.nome = nome;
        this.preco = preco;
    }
    
    public static void ExibirProduto() {
        System.out.println();
    }

}

