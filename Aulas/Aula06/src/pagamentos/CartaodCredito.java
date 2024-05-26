package pagamentos;

public class CartaodCredito implements FormaPagamento{

    private String numeroCartao;
    private double limite;
    private double limiteUsado;
    private String data = LocalDate.now().toString(); //retorna a data de hoje em string

    @Override
    public void receberPagamento(String chave, double valor){
        if ((limiteUsado + valor) < limite){
            System.out.println("Compra aprovada!");
            limiteUsado = limiteUsado + valor;
            return valor;
        }
        System.out.println("Compra reprovada por falta de limite!");
    }

    @Override
    public double reembolsar(double valor){
      this.limiteUsado = this.limiteUsado - valor;
      return valor;
    }

    @Override
    public String emitirComprovante(){
        return "Comprovante";
    
    }
}