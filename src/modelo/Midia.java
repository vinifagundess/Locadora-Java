package modelo;

import LocadoraDeFilmes.inter.Reproduzivel;

public abstract class Midia implements Reproduzivel {
    private String titulo;
    private String genero;
    private int anoLancamento;


    public Midia() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Midia(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;

    }

    public abstract void exibirInformacoes();

    @Override
    public void reproduzir() {
        if (anoLancamento < 2000) {
            System.out.println("Reproduzindo clássico: " + titulo);
        } else {
            System.out.println("Reproduzindo moderno: " + titulo);
        }
    }
}


