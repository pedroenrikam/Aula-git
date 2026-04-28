import java.util.Scanner;

public class Ex04while {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int numeroSecreto = 7;
            int tentativa = 0;

            System.out.println("--- JOGO DO NÚMERO SECRETO ---");
            System.out.print("Tente adivinhar o número: ");
            tentativa = leitor.nextInt();

            while (tentativa != numeroSecreto) {
                System.out.println("Errado! Tente novamente.");
                System.out.print("Digite outro número: ");
                tentativa = leitor.nextInt();
            }
            System.out.println("Parabéns! Você encontrou o número secreto: " + numeroSecreto);

        }
    }

