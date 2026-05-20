import java.util.Scanner;

public class Ex10 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite uma açao");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                IO.println("cadastrar usuario");
                break;
            case 2:
                IO.println("listar usuarios");
                break;
            case 3:
                IO.println("atualizar usuario");
                break;
            case 4:
                IO.println("excluir usuario");
                break;
            case 5:
                IO.println("encerrar sistema");
                break;
                default:
                IO.println(" digite corretamente1");


        }

    }
}
