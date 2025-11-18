import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resposta;
        do {
            System.out.println("opção 1 = continuar");
            System.out.println("opção 2 = sair");
            System.out.println("Digite 1 ou 2");
            resposta = sc.nextInt();
            sc.nextLine();
            if (resposta == 1) {

                System.out.println("Digite uma frase \n");
                String frase = sc.nextLine();
                System.out.println();
                System.out.println(frase);
            } else if (resposta == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado");
            } else {
                System.out.println("Resposta Invalida!, tente novamente \n");
            }

        } while (resposta != 2);

        sc.close();
    }
    
    public static void tabuada (){
        Scanner sc = new Scanner(System.in);
        System.out.println("me informe o número para de se calcular a tabuada: ");
        int nTabuada = sc.nextInt();
        int n1 = 0;
        while(n1 <= 10){
            int resultado = nTabuada * n1;
            System.out.println(nTabuada + " x " + n1 + " = " + resultado);
            n1++;
        }
    }
}
