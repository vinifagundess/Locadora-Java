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

    }

    @Override
    public void pausar() {

    }
}
