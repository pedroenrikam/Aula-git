import java.util.Scanner;

public class Ex03 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite o codigo do produto");
        int codigo = sc.nextInt();
        switch (codigo) {
            case 1:
                IO.println("x burguer R$ 15");
                break;
            case 2:
                IO.println("x salada R$ 18");
                break;
            case 3:
                IO.println("refrigerante R$ 7");
                break;
            case 4:
                IO.println("batata frita R$ 12 ");
                break;
                default:
                IO.println("Produto nao encontrado");


        }
    }
}
