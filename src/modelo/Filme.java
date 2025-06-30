package modelo;

public class Filme extends Midia {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Filme(String titulo, String genero, int anoLancamento, String diretor) {
        super(titulo, genero, anoLancamento);
        this.diretor = diretor;

    }

    @Override
    public void exibirInformacoes() {
        System.out.println(" Filme:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Diretor: " + diretor);

    }

    @Override
    public void pausar() {

    }
}
