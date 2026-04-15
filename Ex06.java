
    import java.util.Scanner;
   public class Ex06 {
   public static void main() {
   Scanner leitor = new Scanner(System.in);
   double nota = 0;
   int contador = 0;
   double nota0 = 0;
   double media = 0;
   IO.println("digite sua nota");
    nota = leitor.nextDouble();
   while (nota != -1){
      contador++;
      nota0 += nota;
      nota = leitor.nextDouble();
   }
   media = nota0 / contador;
      IO.println(media);

}
}
