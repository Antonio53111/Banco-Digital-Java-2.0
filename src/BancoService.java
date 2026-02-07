public class BancoService {
    private static final double LIMITE_SAAQUE = 10000.00;

    public static boolean validarSaque(double valor, double saldo){
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        }
        return true;
    }

    public static boolean validarDeposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
            return false;
        }

        if (valor > 50000) {
            System.out.println("Valor excede o limite por transação!");
            return false;
        }
        return true;
    }
}
