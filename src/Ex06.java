import java.util.Scanner;

public class Ex06 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("escolha seu curso");
        int curso = sc.nextInt();
        switch (curso) {
            case 1:
                IO.println("JAVA");
                IO.println("Onde voce vai aprender programas");
                break;
            case 2:
                IO.println("BANCO DE DADOS");
                IO.println("Memoria de dados");
                break;
            case 3:
                IO.println("DESENVOLVIMENTO WEB");
                IO.println("aprende sobre web");
                break;
            case 4:
                IO.println("REDES");
                IO.println("aprende sobre redes");
                break;
            default:
                IO.println("n temos este curso");

        }
    }
}