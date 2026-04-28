import java.util.Scanner;

public class Ex08while {


        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.print("Digite um número limite: ");
            int limite = leitor.nextInt();

            int soma = 0;
            int i = 1;

            System.out.print("Números pares encontrados: ");

            while (i <= limite) {

                if (i % 2 == 0) {
                    soma += i; 
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println("\n---");
            System.out.println("A soma de todos os pares até " + limite + " é: " + soma);

            leitor.close();
        }
    }

