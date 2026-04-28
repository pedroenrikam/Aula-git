import java.util.Scanner;

public class Ex03while {
    
    public class Main {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite um número para ver a tabuada: ");
            int num = leitor.nextInt();
            int i = 1;
            System.out.println("\nTabuada do " + num + ":");
            while (i <= 10) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
                i++;
            }

            leitor.close();
        }
    }
}
