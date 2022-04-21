import java.time.LocalDate;

public class Movimentacao {
    private LocalDate data;
    private Double valor;
    private TipoMovimentacao tipoMovimentacao;
    private Boolean estorno;


    Movimentacao(LocalDate data, Double valor, TipoMovimentacao tipoMovimentacao, Boolean estorno) {
        this.data = data;
        this.valor = valor;
        this.tipoMovimentacao = tipoMovimentacao;
        this.estorno = estorno;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Boolean getEstorno() {
        return estorno;
    }

    public void setEstorno(Boolean estorno) {
        this.estorno = estorno;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "data=" + data +
                ", valor=" + valor +
                ", tipoMovimentacao=" + tipoMovimentacao +
                ", estorno=" + estorno +
                '}';
    }
}
