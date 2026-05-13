//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// Scanner funciona como uma escuta
    Scanner sc = new Scanner(System.in);
    //pedindo ao usuario paraa digitar a senha
    IO.println(" digite a senha");
    //variavel para quardar oq o usuario digitar
    int senha ;
    // para n precisar repetir novamente
    do {
        //o usuario vai digitar
        senha = sc.nextInt();
        //se  for diferente de...
        if (senha !=1234){
            //vai aparecer oq escrevi dentro do iop
    IO.println("senha incorreta. tente novamente!!!");
        }
        // indentificar o comando verdadeiro
    } while(senha != 1234);
    // se for correto vai aparecer oq escrevi dentro do iop
    IO.println("senha correta. Celular desbloqueado!!!");

}
