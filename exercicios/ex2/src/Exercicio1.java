// 1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número para gerar a tabuada:");
        int numero = Integer.parseInt(System.console().readLine());
        gerarTabuada(numero);
    }

    public static void gerarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
