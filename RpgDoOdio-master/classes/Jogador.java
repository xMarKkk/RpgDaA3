package classes;
import java.util.ArrayList;

public class Jogador {
    private ArrayList<Personagens> personagensEscolhidos;

    public Jogador() {
        this.personagensEscolhidos = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagens personagem) {
        personagensEscolhidos.add(personagem);
    }

    public ArrayList<Personagens> getPersonagensEscolhidos() {
        return personagensEscolhidos;
    }

    public void mostrarStatus() {
        if (!personagensEscolhidos.isEmpty()) {
            System.out.println("Status do(s) personagem(ns) escolhido(s):");
            for (Personagens personagem : personagensEscolhidos) {
                System.out.println("Nome: " + personagem.getNome());
                System.out.println("Vida: " + personagem.getVida());
                System.out.println("Ataque: " + personagem.getAtaque());
                System.out.println("Defesa: " + personagem.getArmadura());
                System.out.println("------------------");
            }
        } else {
            System.out.println("Você ainda não escolheu um personagem.");
        }
    }
}