package src;
//import combate.Batalha;
import classes.Jogador;
import inventario.Inventario;
import src.Funcoes;
import src.MenuPrincipal;

public class Main {
    public static void main(String[] args){
       Jogador jogador = new Jogador();
        Funcoes f = new Funcoes(jogador);
        MenuPrincipal m = new MenuPrincipal();
        Inventario i = new Inventario();
       // Batalha b = new Batalha();
        System.out.println("ola aventureiros,  bem vindos a eldorian!");
        System.out.println();

        //b.iniciarBatalha();
       f.escolherClasse();
        m.menu();

        //i.inventario();




    }
            }