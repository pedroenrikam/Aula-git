import java.util.Scanner;

public class Ex09 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite uma letra");
        String conceito = sc.nextLine();
        switch (conceito) {
            case "a":
                IO.println("exelente");
                break;
            case "b":
                IO.println("bom");
                break;
            case "c":
                IO.println("regular");
                break;
           case "d":
                IO.println("ruim");
                break;
                default:
                IO.println("digite corretamente");


        }
    }
}


