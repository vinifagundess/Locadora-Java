package LocadoraDeFilmes.controlador;
import modelo.Midia;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Midia> midias;

    public Catalogo() {
        midias = new ArrayList<>();
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }

    public void addMidia (Midia m) {
        midias.add(m);
        System.out.println("Midia adicionada com sucesso: " + m.getTitulo());
    }
    public void removeMidia (Midia m) {
        midias.remove(m);
    }

    public void listarMidias() {
        if (midias.isEmpty()) {
            System.out.println("Nenhuma mídia cadastrada");
        }
    }
}
