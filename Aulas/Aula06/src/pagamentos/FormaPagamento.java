package pagamentos;

public interface FormaPagamento{
    void receberPagamento();
    double reembolsar();
    String emitirComprovante();

}