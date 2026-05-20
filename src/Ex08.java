import java.util.Scanner;

public class Ex08 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("escolha um sistema do caixa");
        int sistema = sc.nextInt();
        switch (sistema) {
            case 1:
                IO.println("Consultar saldo");
                break;
            case 2:
                IO.println("Sacar dinheiro");
                break;
            case 3:
                IO.println("Depositar dinheiro");
                break;
                default:
                    IO.println("sem opçoes");


        }
    }
}
