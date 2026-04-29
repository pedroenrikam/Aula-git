import java.util.Scanner;

    public class Ex03FOR {


    void main() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            String numero = sc.next();
            int soma = 0;
            for (int i = 0; i < numero.length(); i++) {
            int c = numero.charAt(i);

            soma += Character.getNumericValue(c);
            }
            System.out.println("A soma dos dígitos é: " + soma);

           sc.close();
        }
    }








