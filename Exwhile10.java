import java.util.Scanner;

public class Exwhile10 {

    public class ContadorPositivosNegativos {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int positivos = 0;
            int negativos = 0;
            int numero = -1;

            System.out.println("--- CONTADOR DE POSITIVOS E NEGATIVOS ---");
            System.out.println("Digite os números (ou 0 para encerrar):");

            while (numero != 0) {
                System.out.print("Digite um número: ");
                numero = leitor.nextInt();

                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                }
            }
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Quantidade de números positivos: " + positivos);
      System.out.println("Quantidade de números negativos: " + negativos);
      System.out.println("Total de números válidos digitados: " + (positivos + negativos));
            leitor.close();
        }
    }
}
