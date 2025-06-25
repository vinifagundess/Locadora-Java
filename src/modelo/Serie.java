package modelo;

public class Serie extends Midia {
    private int temporadas;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Serie(String titulo, String genero, int anoLancamento, int temporadas) {
        super(titulo, genero, anoLancamento);
        this.temporadas = temporadas;
    }

    @Override
    public void exibirInformacoes() {
        if (temporadas == 1) {
            System.out.println("Série com temporada única " + getTitulo());
        } else {
            System.out.println("Série com " + getTemporadas() + "temporadas :" + getTitulo());
        }

    }

    @Override
    public void pausar() {

    }
}
