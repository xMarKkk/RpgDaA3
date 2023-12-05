package classes;
import src.Funcoes;

public class Jogador{



    public Personagens personagemEscolhido;

    public void escolherPersonagem(Personagens personagem) {
        personagemEscolhido = personagem;
    }

    public Personagens getPersonagemEscolhido() {
        return personagemEscolhido;
    }

    public void setPersonagemEscolhido(Personagens personagemEscolhido) {
        this.personagemEscolhido = personagemEscolhido;

    }

}