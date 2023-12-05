
package combate;
import classes.Jogador;
import classes.Personagens;


import java.util.Scanner;
import java.util.Random;
public class Batalha{


    public void iniciarBatalha(/*Heroi player1, Heroi player2, Heroi player3, Heroi player4,*/ Vilao vilao1)  {/*
        Scanner read = new Scanner(System.in);

        Jogador jogador;
        Personagens p = new Personagens();

        ///////// Tela principal batalha /////////
        System.out.println("-----Batalha Iniciada-----\n\n");

        while (vilao1.vidaVilao > 0 && (p.getVidaMax() > 0 || p.getVidaMax() > 0 || p.getVidaMax() > 0 || p.getVidaMax() > 0)) {

            System.out.println(vilao1.nomeVilao + "\nHP: " + vilao1.vidaVilao);
            System.out.println("===============");


            System.out.println("\n\n\n");
            System.out.println(p.getNome() + "\nHP: " + p.getVidaMax());
            System.out.println("===============");
            System.out.println(p.getNome() + "\nHP: " + p.getVidaMax());
            System.out.println("===============");
            System.out.println(p.getNome() + "\nHP: " + p.getVidaMax());
            System.out.println("===============");
            System.out.println(p.getNome() + "\nHP: " + p.getVidaMax());
            System.out.println("===============");

            System.out.println("\n\n");


            //// Alterar para funcionar por meio da velocidade ao inves do dado
            System.out.println("Jogando Dados:");
            Random random = new Random();
            int dado = random.nextInt(5) + 1;
            System.out.println("Dado = " + dado);
            System.out.println("\n");


            //Variaveis usadas somente na batalha
            String nomeHeroiAlvo;
            double danoAtual = 0;

            ////Turno do vilao
            if (dado == 1) {

                //Definir qual ataque o vilao vai usar
                int ataqueVilao = random.nextInt(3) + 1;
                switch (ataqueVilao) {
                    case 1:
                        danoAtual = vilao1.danoVilaoFraco;
                        break;
                    case 2:
                        danoAtual = vilao1.danoVilaoMedio;
                        break;
                    case 3:
                        danoAtual = vilao1.danoVilaoForte;
                        break;

                }

                //Definir quem vilao vai atacar
                int heroiAlvo = random.nextInt(4) + 1;


                if (heroiAlvo == 1) {
                    p.getVidaMax() -= danoAtual;
                    nomeHeroiAlvo = p.getNome();
                } else if (heroiAlvo == 2) {
                    p.getVidaMax() -= danoAtual;
                    nomeHeroiAlvo = p.getNome();
                } else if (heroiAlvo == 3) {
                    p.getVidaMax() -= danoAtual;
                    nomeHeroiAlvo = p.getNome();
                } else {
                    p.getVidaMax() -= danoAtual;
                    nomeHeroiAlvo = p.getNome();
                }
                System.out.println("\n\n" + vilao1.nomeVilao + " Ataca " + nomeHeroiAlvo + " e causa: " + danoAtual + " de dano");

                //Trurno Heroi
            } else {


                //Definir de qual heroi é o turno
                //+++++falta definir vida,dano e itens de cada heroi para heroiAtual
                // Ou seja nessa parte HeroiAtual deve receber todos os atributos do heroi selecionado
                Heroi playerAtual;
                if (dado == 2) {
                    playerAtual = player1;
                } else if (dado == 3) {
                    playerAtual = player2;
                } else if (dado == 4) {
                    playerAtual = player3;
                } else {
                    playerAtual = player4;
                }

                if (playerAtual.vidaHeroi > 0) { // Se o heroi tiver vida
                    System.out.println(playerAtual.nomeHeroi + " esta atuando!");
                    System.out.println("Oque deseja fazer?");
                    System.out.println("1-Atacar");
                    System.out.println("2-Usar item da bolsa");
                    System.out.println("3-Fugir");
                    int escolha = read.nextInt();
                    int escolhaAtaque = 0;
                    System.out.println("\n\n");

                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Escolha invalida, Digite novamente:");

                    } else if (escolha == 1) {

                        //////Menu de ataques
                        while (escolhaAtaque != 1 && escolhaAtaque != 2 && escolhaAtaque != 3) {
                            System.out.println("1-Ataque leve");
                            System.out.println("2-Ataque rapido");
                            System.out.println("3-Ataque pesado");

                            escolhaAtaque = read.nextInt();


                            //Definir o dano Atual

                            if (escolhaAtaque < 1 || escolhaAtaque > 3) {
                                System.out.println("Escolha invalida, Digite novamente:");
                            } else if (escolhaAtaque == 1) {
                                danoAtual = playerAtual.danoHeroiFraco;
                                vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
                            } else if (escolhaAtaque == 2) {
                                danoAtual = playerAtual.danoHeroiMedio;
                                vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
                            } else {
                                danoAtual = playerAtual.danoHeroiForte;
                                vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
                            }

                            System.out.println("\n\n");
                        }// laço escolha ataque

                        System.out.println(playerAtual.nomeHeroi + " Ataca " + vilao1.nomeVilao + " e causa " + danoAtual + " de dano");
                    }
                } else { // Se o heroi não tiver vida

                    System.out.println("O heroi " + playerAtual.nomeHeroi + " esta morto! \n\n Dado sera Jogado novamente: \n");

                }

            } // turno player


        } // laço repeticao prncipal

        if (vilao1.vidaVilao <= 0) {
            System.out.println(vilao1.nomeVilao + " Morreu");
        } else {
            System.out.println("----------GAME OVER------------");
        }

    */}

}
