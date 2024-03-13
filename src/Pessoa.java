import java.util.List;

public class Pessoa {

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;
    private String genero;

    public Pessoa(){

    }


    public Pessoa(String id, String nome, String nacionalidade, int idade, String genero) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.genero = genero;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Pessoa> popularPessoa(){
    Pessoa pessoa1 = new Pessoa("p1", "Rafael", "Brasileiro", 20, "masculino");
        Pessoa pessoa2 = new Pessoa("p2", "Eduarda", "Brasileira", 22, "feminino");
        Pessoa pessoa3 = new Pessoa("p3", "Mayara", "Brasileira", 20, "feminino");
        Pessoa pessoa4 = new Pessoa("p4", "Rodney", "Brasileiro", 24, "masculino");
        Pessoa pessoa5 = new Pessoa("p5", "Carla", "Brasileiro", 24, "feminino");

        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
    }

    @Override
    public String toString() {
        return  nome + " - " + genero;
    }
}
