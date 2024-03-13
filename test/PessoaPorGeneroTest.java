import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PessoaPorGeneroTest {
    @Test
    public void primeiroTeste() {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        List<Pessoa> mulheres = new ArrayList<>();
        
        System.out.println("Lista de pessoas");
        lista.stream().forEach(System.out::println);

        System.out.println("\nPessoas do sexo feminino");
        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("feminino"))
                .forEach(mulheres::add);
        System.out.println(mulheres);
        
        Assert.assertTrue(mulheres.stream().allMatch(pessoa -> pessoa.getGenero().equals("feminino")));
    }

}
