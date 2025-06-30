package LocadoraDeFilmes.app;
import LocadoraDeFilmes.controlador.Catalogo;
import modelo.Filme;
import modelo.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        System.out.println("Bem-vindo à Locadora!");
        System.out.println("Digite 1 para cadastrar um FILME");
        System.out.println("Digite 2 para cadastrar uma SÉRIE");

        int opcao = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        if (opcao == 1) {
            System.out.println("Título do filme:");
            String titulo = sc.nextLine();
            System.out.println("Gênero:");
            String genero = sc.nextLine();
            System.out.println("Ano de lançamento:");
            int ano = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha
            System.out.println("Diretor:");
            String diretor = sc.nextLine();

            Filme filme = new Filme(titulo, genero, ano, diretor);
            catalogo.addMidia(filme);

        } else if (opcao == 2) {
            System.out.println("Título da série:");
            String titulo = sc.nextLine();
            System.out.println("Gênero:");
            String genero = sc.nextLine();
            System.out.println("Ano de lançamento:");
            int ano = sc.nextInt();
            System.out.println("Quantidade de temporadas:");
            int temporadas = sc.nextInt();

            Serie serie = new Serie(titulo, genero, ano, temporadas);
            catalogo.addMidia(serie);

        } else {
            System.out.println("Opção inválida.");
        }

        System.out.println("Deseja listar todas as mídias? \n1-sim 2-nao");
        int resposta = sc.nextInt();

        if (resposta == 1) {
            catalogo.listarMidias();
        } else {
            System.out.println("Ok, encerrando o programa.");
        }
    }
}