import java.util.Scanner;

public class Ex03 {
    void main(){
        Scanner sc = new Scanner(System.in);
String nickname;
 String jogofavorito;
 double pontuaçao;
        IO.println("qual o seu nick?");
        nickname = sc.next();
        IO.println("qual seu jogo favorito?");
        jogofavorito = sc.next();
        IO.println("sua pontuaçao");
        pontuaçao = sc.nextInt();
        IO.println( "nickname"+ nickname + "\npontuaçao :" + pontuaçao +"\nnome do jogo:"+  jogofavorito);




    }
}
