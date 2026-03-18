import java.util.Scanner;

public class Ex02 {
   void main()  {
       Scanner sc = new Scanner(System.in);
       String nomedocliente;
      String prato;
      double valor ;
      IO.println("qual o seu nome?");
      nomedocliente = sc.next();
       IO.println("qual o nome do prato");
       prato = sc.next();
IO.println("qual o valor do prato");
valor = sc.nextInt();
     IO.println( "prato "+ prato + "\nvalor :" + valor +"\nnome do cliente:"+ nomedocliente);


   }
}
