import java.util.Scanner;

public class Ex07 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite uma letra");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                IO.println("vogal");
                break;
            case "e":
                IO.println("vogal");
                break;
            case "i":
                IO.println("vogal");
                break;
            case "o":
                IO.println("vogal");
                break;
            case "u":
                IO.println("vogal");
                break;
            default:
                IO.println("NAO E UMA VOGAL");

        }
    }
}
