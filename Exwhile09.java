import java.util.Scanner;

public class Exwhile09 {


        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            int maior = Integer.MIN_VALUE;
            int numero = -1;

            System.out.println("--- DESCUBRA O MAIOR NÚMERO ---");
            System.out.println("Digite os números (digite 0 para encerrar):");

            while (numero != 0) {
                System.out.print("Digite um número: ");
                numero = leitor.nextInt();


                if (numero != 0) {
                    if (numero > maior) {
                        maior = numero;
                    }
                }
            }

            if (maior == Integer.MIN_VALUE) {
                System.out.println("Você não digitou nenhum número além do zero.");
            } else {
                System.out.println("\n🏆 O maior número digitado foi: " + maior);
            }

            leitor.close();
        }
    }

