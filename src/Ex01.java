import java.util.Scanner;

public class Ex01 {
    void main() {
        String nome ;
        String nomecurso ;
        int idade ;
        Scanner sc = new Scanner(System.in);

        IO.println("coloque seu nome");
       nome = sc.next();
        IO.println("coloque o seu curso");
        nomecurso = sc.next();
        IO.println("coloque sua idade");
      idade  = sc.nextInt();
      IO.println("olá" + nome);
      IO.println("voce esta matriculado em" + nomecurso);
        IO.println("sua idade é " + idade);

    }


}
