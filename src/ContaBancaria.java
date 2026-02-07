public class ContaBancaria {

    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
