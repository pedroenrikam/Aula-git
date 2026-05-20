import java.util.Scanner;

public class Ex05 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite o usuario");
        String acesso = sc.nextLine();
        switch (acesso) {
            case "a":
                IO.println("Administrador---- acesso total");
                break;
            case "f":
                IO.println("Funcionario------ acesso restrito");
                break;
            case "c":
                IO.println("Cliente------ acesso por permissao");
                break;
            default:
                IO.println(" nao tem acesso");


        }
    }
}
