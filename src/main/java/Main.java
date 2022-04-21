import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movimentacao movimentacao = new Movimentacao(LocalDate.now(),1300.10, TipoMovimentacao.RECEITA, false);
        Cliente priscila = new Cliente("Priscila Silva", "172368712",movimentacao);

        Cliente flavio = new Cliente("Flavio Costa", "9812631892", new Movimentacao(
            LocalDate.now(),
            1500.0,
            TipoMovimentacao.DESPESA,
            true
        ));


        System.out.println(flavio.toString());

        flavio.getMovimentacao().setValor(1400.10);
        System.out.println(flavio.getMovimentacao().getValor());
    }
}
