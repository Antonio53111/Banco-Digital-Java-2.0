import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private String dataHora;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = obterDataAtual();
    }

    private String obterDataAtual() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.format(new Date());
    }

    public String getTipo() {
        return tipo;
    }

    public double GetValor() {
        return valor;
    }
    public String getDataHora() {
        return dataHora;
    }

    public String formatar(){
        return dataHora + " - " + tipo + "R$ " + valor;
    }


}
