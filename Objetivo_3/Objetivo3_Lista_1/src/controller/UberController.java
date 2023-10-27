package controller;
import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Comparator;

public class UberController {
    public static void main(String[] args) {

        Usuario user = new Usuario(11L,"Carmen", "zitzkecarmen@gmail.com", "(53) 99115-0010");

        Veiculo veic = new Veiculo(7766L, "Carro", "IUA-4022", 2014);

        Motorista mot = new Motorista(65L, "Henrique", "Henriqueuber@gmail.com", "(48) 99975-8974", veic);

        Corrida corr1 = new Corrida(3434L, "Dinheiro", "Cédulas e moedas", LocalDateTime.of(2022, 5, 18, 18,15), 14.99, mot, user);
        Corrida corr2 = new Corrida(4343L, "Cartão de crédito", "Bandeira VISA", LocalDateTime.of(2023, 11, 15, 13, 0), 27.53, mot, user);

        user.getCorridas().add(corr1);
        user.getCorridas().add((corr2));

        System.out.println("Corridas por Usuário:\n");
        user.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(user.getCorridas());

        mot.getCorridas().add(corr1);
        mot.getCorridas().add(corr2);

        System.out.println("Corridas por Motorista:\n");
        mot.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(mot.getCorridas());

        System.out.println("\nValor Total das Corridas:");
        System.out.print("Motorista = " + mot.getNome());
        System.out.println("\nValor = " + NumberFormat.getCurrencyInstance().format(mot.getCorridas().stream().mapToDouble(corrida -> corrida.getPreco()).sum()));

    }
}