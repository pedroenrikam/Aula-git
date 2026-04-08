import java.util.Scanner;

public class ex02 {
    void main() {
        Scanner sc = new Scanner(System.in);

        IO.println(" digite um numero: ");
        int num1 = sc.nextInt();

        while (num1 != 0) {
            if (num1 % 2 == 0) {
                IO.println("seu numero e par");

            } else {
                IO.println("seu numero e impar");


            }
            num1 = sc.nextInt();
        }

    }
}