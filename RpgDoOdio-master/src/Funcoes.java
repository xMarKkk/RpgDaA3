package src;
import classes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
    Scanner ler = new Scanner(System.in);
    Jogador j = new Jogador();

    //public Funcoes(Jogador jogador) {
      //  this.jogador = jogador;
   // }

    public void escolherClasse() {
        System.out.println("Escolha o seu personagem:");
        System.out.println("[1] - Cavaleiro");
        System.out.println("[2] - Mago");
        System.out.println("[3] - Clerigo");
        System.out.println("[4] - Arqueira");
        System.out.println("[5] - Ladino");

        int classe = ler.nextInt();
        Personagens personagem = null;

        switch (classe) {
            case 1:
                personagem = new Cavaleiro();
                System.out.println("Você escolheu o Cavaleiro!");
                break;
            case 2:
                personagem = new Mago();
                System.out.println("Você escolheu o Mago!");
                break;
            case 3:
                personagem = new Clerigo();
                System.out.println("Você escolheu o Clerigo!");
                break;
            case 4:
                personagem = new Arqueira();
                System.out.println("Você escolheu a Arqueira!");
                break;
            case 5:
                personagem = new Ladino();
                System.out.println("Você escolheu o Ladino!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (personagem != null) {
           j.adicionarPersonagem(personagem);
        }
    }
}


