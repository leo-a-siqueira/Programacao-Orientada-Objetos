
import java.util.*;

import Loja.Loja;
import Loja.Produto;

class App{

  
    public static void main(String[] args){
        Loja loja = new Loja("Mobile City", "Rua Maringá, N° 300");        

        Produto produto = new Produto("Samsung", "Galaxy S21", 3500.99);
        Produto produto2 = new Produto("Apple", "Iphone 14", 5990.90);
        Produto produto3 = new Produto("Samsung", "Galaxy S22", 6590.90);

        System.out.println(produto.getMarca() + " " + produto.getNome() + " " + produto.getPreco());
        System.out.println(produto2.getMarca() + " " + produto2.getNome() + " " + produto2.getPreco());
        System.out.println(produto3.getMarca() + " " + produto3.getNome() + " " + produto3.getPreco());    
      
    }
}