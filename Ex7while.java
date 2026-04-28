import java.util.Scanner;

public class Ex7while {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            long fatorial = 1;
            int contador = numero;

            System.out.print(numero + "! = ");

            while (contador > 0) {
                fatorial *= contador;

                if (contador > 1) {
                    System.out.print(contador + " × ");
                } else {
                    System.out.print(contador);
                }


            }

            System.out.println(" = " + fatorial);
            sc.close();
        }
    }

