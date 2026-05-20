import java.util.Scanner;

public class Ex04 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um numero");
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
                IO.println("janeiro");
                break;
            case 2:
                IO.println("fevereiro");
                break;
            case 3:
                IO.println("março");
                break;
            case 4:
                IO.println("maio");
                break;
            case 5:
                IO.println("junho");
                break;
            case 6:
                IO.println("julho");
                break;
            case 7:
                IO.println("agosto");
                break;
            case 8:
                IO.println("setembro");
                break;
            case 9:
                IO.println("outubro");
                break;
            case 10:
                IO.println("novembro");
                break;
            case 11:
                IO.println("dezembro");
                break;
                default:
                    IO.println("mes nao encontrado");

        }
    }}
