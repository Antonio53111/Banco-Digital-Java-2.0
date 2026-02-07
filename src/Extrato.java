import java.util.ArrayList;
import java.util.List;

public class Extrato {
    private List<Transacao> transacoes;
    private ContaBancaria conta;

    public Extrato(ContaBancaria conta){
        this.conta = conta;
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao){
        transacoes.add(transacao);
    }

    public String gerarExtratoCompleto(){
        StringBuilder extrato = new StringBuilder();

        extrato.append("EXTRATO DA CONTA \n");
        extrato.append("Conta: ").append(conta.getNumeroConta()).append("\n");
        extrato.append("Saldo Atual: R$ ").append(conta.getSaldo()).append("\n");
        extrato.append("-----------\n");

        if(transacoes.isEmpty()){
            extrato.append("Nenhuma transação realizada\n");
        } else {
            for (Transacao t : transacoes){
                extrato.append(t.formatar()).append("\n");
            }
        }
        return extrato.toString();

    }



}
