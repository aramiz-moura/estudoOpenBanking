

public class Cliente {
    private String nome;
    private String cpfCnpj;
    private Movimentacao movimentacao;


    Cliente(String nome, String cpfCnpj, Movimentacao movimentacao) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.movimentacao = movimentacao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", movimentacao=" + movimentacao +
                '}';
    }
}
