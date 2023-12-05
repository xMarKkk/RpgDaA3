package combate;
import classes.Personagens;
import java.util.Scanner;
import java.util.Random;
public class Batalha {


    public void iniciarBatalha(Heroi player1, Vilao vilao1) {
        Scanner read = new Scanner(System.in);


        Personagens p = new Personagens();

        ///////// Tela principal batalha /////////
        System.out.println("-----Batalha Iniciada-----\n\n");

        while (vilao1.vidaVilao > 0 && (player1.vidaHeroi) > 0) {

            System.out.println(vilao1.nomeVilao + "\nHP: " + vilao1.vidaVilao);
            System.out.println("===============");


            System.out.println("\n\n\n");
            System.out.println(player1.nomeHeroi + "\nHP: " + player1.vidaHeroi);
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


                System.out.println("\n\n" + vilao1.nomeVilao + " Ataca " + player1.nomeHeroi + " e causa: " + danoAtual + " de dano");

                //Trurno Heroi
            } else {
            }
            ;

            if (player1.vidaHeroi > 0) { // Se o heroi tiver vida
                System.out.println(player1.nomeHeroi + " esta atuando!");
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
                            danoAtual = player1.danoHeroiFraco;
                            vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
                        } else if (escolhaAtaque == 2) {
                            danoAtual = player1.danoHeroiMedio;
                            vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
                        } else {
                            danoAtual = player1.danoHeroiForte;
                            vilao1.vidaVilao = vilao1.vidaVilao - danoAtual;
                        }

                        System.out.println("\n\n");
                    }// laço escolha ataque

                    System.out.println(player1.nomeHeroi + " Ataca " + vilao1.nomeVilao + " e causa " + danoAtual + " de dano");
                }
            } else { // Se o heroi não tiver vida

                System.out.println("O heroi " + player1.nomeHeroi + " esta morto! \n\n Dado sera Jogado novamente: \n");

            }

            // turno player


        } // laço repeticao prncipal

        if (vilao1.vidaVilao <= 0) {
            System.out.println(vilao1.nomeVilao + " Morreu");
        } else {
            System.out.println("----------GAME OVER------------");
        }

    }
}

