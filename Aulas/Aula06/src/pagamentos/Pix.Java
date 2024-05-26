package pagamentos;

public class Pix implements FormaPagamento{

    private String chave;
    private double valor;
    private String data = LocalDate.now().toString(); //retorna a data de hoje em string

    @Override
    public void receberPagamento(String chave, double valor){
        this.chave = chave;
        this.valor = valor;
        System.out.println("Recebido de: " + this.chave + "Valor: " + this.valor);
        return this.valor;
    }
    @Override
    public double reembolsar(String chave){
        System.out.println("Enviando para a chave" + this.chave);
        return this valor;
    }
    @Override
    public String emitirComprovante(){
        return String.format("Valor %s%n Data: %s", this.valor, this.data );
    }
}