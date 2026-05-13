import java.util.Scanner;

public class Ex04 {

    void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("digite um numero");
        int num = sc.nextInt();
        int num2 = 1;
        do {
            IO.println(num * num2);
            num2++;


        } while (num2 != 11);

    }
}

