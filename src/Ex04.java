void main () {



    Scanner sc = new Scanner(System.in);

    // Criamos o scanner para ler a entrada do teclado
    Scanner scanner = new Scanner(System.in);

    // Definição da meta constante
    int meta = 10000;

    System.out.print("Digite a quantidade de passos dados hoje: ");
    int passosDados = scanner.nextInt();

    if (passosDados <= 500) {

        IO.println("vc está andando pouco");
        IO.println(10000 - passosDados);


    } else if (passosDados <=5000) {

        IO.println("falta pouco");
        IO.println(10000 - passosDados);

    }else{

        IO.println("meta concluida");
        IO.println(passosDados - 10000);

    }


}

