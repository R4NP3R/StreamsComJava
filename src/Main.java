import java.util.List;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        System.out.println("Lista de pessoas");
        lista.stream().forEach(System.out::println);

        System.out.println("\nPessoas do sexo feminino");
        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("feminino"))
                .forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getGenero()));
    }
}