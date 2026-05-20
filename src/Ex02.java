import java.util.Scanner;

public class Ex02 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite um numero");
        double num1 = sc.nextDouble();
        IO.println("digite o segundo numero");
        double num2 = sc.nextDouble();
        IO.println("digite a operaçao matematica");
        String simbolo = sc.next();
        switch (simbolo) {
            case "+":
                IO.println(num1 + num2);
                break;
            case "-":
                IO.println(num1 - num2);
                break;
            case "*":
                IO.println(num1 * num2);
                break;
            case "/":
                IO.println(num1 / num2);
                break;


        }
    }
}
