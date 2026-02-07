import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("12345-6", 1000.00);
        Extrato extrato = new Extrato(conta);

        boolean executando = true;

        while(executando){
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo Atual: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();

                    if(BancoService.validarSaque(valorSaque, conta.getSaldo())){
                        conta.sacar(valorSaque);
                        Transacao saque = new Transacao("SAQUE ", valorSaque);
                        extrato.adicionarTransacao(saque);
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Valor para deposito: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (BancoService.validarDeposito(valorDeposito)) {
                        conta.depositar(valorDeposito);
                        Transacao deposito = new Transacao("DEPOSITO ", valorDeposito);
                        extrato.adicionarTransacao(deposito);
                        System.out.println("Valor depositado com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println(extrato.gerarExtratoCompleto());
                    break;

                case 5:
                    executando = false;
                    System.out.println("Até a próxima!");
                    break;

                default:
                    System.out.println("Opcão invalida!");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Bem vindo ao banco");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Exibir Extrato");
        System.out.println("5 - Sair");
        System.out.println("Escolha uma das opções acima!");
    }
}
