
    import java.util.Scanner;

    public class Ex06 {
        public static void main(String args) {
            Scanner leitor = new Scanner(System.in);

            double soma = 0;
            int contador = 0;
            double nota = 0;

            System.out.println("Digite as notas (ou -1 para calcular a média):");

            while (true) {
                System.out.print("Nota: ");
                nota = leitor.nextDouble();

                // Verifica se o usuário quer parar
                if (nota == -1) {
                    break;
                }

                soma += nota;     // soma = soma + nota
                contador++;       // incrementa a quantidade de notas
            }

            // Verifica se alguma nota foi digitada para evitar divisão por zero
            if (contador > 0) {
                double media = soma / contador;
                System.out.println("\n--- Resultado ---");
                System.out.println("Quantidade de notas: " + contador);
                System.out.printf("Média final: %.2f%n", media);
            } else {
                System.out.println("Nenhuma nota válida foi inserida.");
            }

            leitor.close();
        }













}
