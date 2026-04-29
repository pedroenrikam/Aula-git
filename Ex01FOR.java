import java.util.Scanner;
public class Ex01FOR {
    void main() {

Scanner sc = new Scanner(System.in);

System.out.print("Digite um número para calcular o fatorial ");
int numero = sc.nextInt();

int fatorial = 1;

for (int i = numero; i >= 1; i--) {
fatorial *= i;

System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

}




