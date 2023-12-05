package src;

import classes.*;
import java.util.Scanner;
import classes.Jogador;

public class Funcoes {
    Personagens p = new Personagens();
    Scanner ler = new Scanner(System.in);
    Jogador jogador;
    public Funcoes(Jogador jogador){
        this.jogador = jogador;
    }
    Personagens personagemEscolhido = null;

    public void escolherClasse() {
        System.out.println("Escolha o seu personagem:");
        System.out.println("[1] - Cavaleiro");
        System.out.println("[2] - Mago");
        System.out.println("[3] - Clerigo");
        System.out.println("[4] - Arqueira");
        System.out.println("[5] - Ladino");

        int classe = ler.nextInt();

        switch (classe) {
            case 1:
                Cavaleiro cavaleiro = new Cavaleiro();
                personagemEscolhido = cavaleiro;
                System.out.println("Você escolheu o Cavaleiro!");
                jogador.escolherPersonagem(cavaleiro);
                break;
            case 2:
                Mago mago = new Mago();
                jogador.setPersonagemEscolhido(mago);
                System.out.println("Você escolheu o Mago!");
                jogador.escolherPersonagem(mago);
                break;
            case 3:
                Clerigo clerigo = new Clerigo();
                personagemEscolhido = clerigo;
                System.out.println("Você escolheu o Clerigo!");
                jogador.escolherPersonagem(clerigo);
                break;
            case 4:
                Arqueira arqueira = new Arqueira();
                personagemEscolhido = arqueira;
                System.out.println("Você escolheu a Arqueira!");
                jogador.escolherPersonagem(arqueira);
                break;
            case 5:
                Ladino ladino = new Ladino();
                personagemEscolhido = ladino;
                System.out.println("Você escolheu o Ladino!");
                jogador.escolherPersonagem(ladino);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

    public void mostrarStatus() {
        Personagens personagemEscolhido = jogador.getPersonagemEscolhido();

        if (personagemEscolhido != null) {
            System.out.println("Status do personagem escolhido:");
            System.out.println("Nome: " + personagemEscolhido.getNome());
            System.out.println("Vida: " + personagemEscolhido.getVida());
            System.out.println("Ataque: " + personagemEscolhido.getAtaque());
            System.out.println("Defesa: " + personagemEscolhido.getArmadura());
            //Falta adicionar os outros atributos relevantes do personagem
        } else {
            System.out.println("Você ainda não escolheu um personagem.");
        }
    }
}
