

import java.util.Scanner;
import java.util.Random;

public class CavernaDoDestino {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random dado = new Random();

        int vida = 100;
        int moedas = 0;
        boolean explorando = true;

        System.out.println(" BEM-VINDO À CAVERNA DO DESTINO ");
        System.out.println("Seu objetivo: Acumular riquezas e sobreviver.");

        while (explorando && vida > 0) {
            System.out.println("\n--------");
            System.out.println("O que você deseja fazer?");
            System.out.println("1) Continuar Explorando");
            System.out.println("2) Descansar (Recupera Vida)");
            System.out.println("3) Ver Status");
            System.out.println("4) Sair da Caverna");
            System.out.print("Escolha: ");

            String escolha = leitor.nextLine();

            switch (escolha) {
                case "1":
                    int evento = dado.nextInt(100);

                    if (evento < 30) { // 30% chance de moedas
                        int achado = dado.nextInt(20) + 5;
                        moedas += achado;
                        System.out.println("✨ Você encontrou um baú com " + achado + " moedas!");
                    } else if (evento < 60) { // 30% chance de ataque
                        int dano = dado.nextInt(25) + 10;
                        vida -= dano;
              System.out.println("⚔️ Um morcego gigante te atacou! Você perdeu " + dano + " de vida.");
              } else if (evento < 80) { // 20% área segura
              System.out.println("🌿 Você encontrou uma fonte de água cristalina. Sente-se em paz.");
              } else { // 20% nada
                  System.out.println("💨 Caminhou por minutos e só encontrou poeira e eco.");
                    }
                    break;

                case "2":
                    if (vida < 100) {
                        vida += 15;
                        if (vida > 100) vida = 100;
                        System.out.println("💤 Você dormiu um pouco. Vida recuperada para: " + vida);
                    } else {
                        System.out.println("Você já está cheio de energia!");
                    }
                    break;

                case "3":
                    System.out.println("\n--- STATUS ATUAL ---");
                    System.out.println("Vida: " + vida + " HP");
                    System.out.println("Riqueza: " + moedas + " moedas");
                    break;

                case "4":
       System.out.println("Você decidiu sair com vida. Sensato.");
       explorando = false;
       break;

       default:
       System.out.println("Opção inválida! O medo te fez hesitar.");
       break;
            }

       if (vida <= 0) {
       System.out.println("\n Você sucumbiu às trevas da caverna... Fim de jogo.");
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Moedas coletadas: " + moedas);
        System.out.println("Obrigado por jogar!");
        leitor.close();
    }


}
