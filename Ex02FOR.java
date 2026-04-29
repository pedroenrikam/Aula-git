import java.util.Scanner;
public class Ex02FOR {
    void main() {

Scanner sc = new Scanner(System.in);

System.out.print("Quantos números você deseja digitar? ");
int n = sc.nextInt();

int maior =
int menor =

for (int i = 1; i <= n; i++) {
System.out.print("Digite o " + i + "º número: ");
int atual = sc.nextInt();

if (atual > maior) {
maior = atual;
                    }

if (atual < menor) {
menor = atual;
                    }
                }
System.out.println("---");
System.out.println("O maior número digitado foi: " + maior);
System.out.println("O menor número digitado foi: " + menor);
sc.close();
            }
        }









