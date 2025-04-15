import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int option;
        do {
            System.out.println("Digite 1 para ímpar ou 2 para par");
            option = scanner.nextInt();
            if (option >= 1 && option <= 2) {
                break;
            }
        } while (true);

        calcular(num1, num2, option);
    }

    static void calcular(int num1, int num2, int option) {
        if (option == 1) {
            System.out.println("Número ímpar.");
             for (int i = num2; i >= num1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }   
             }
        } else {
            System.out.println("Número ímpar.");
            for (int i = num2; i >= num1; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}

/*
 * 3. Escreva um código que o usuário entre com um primeiro número, um segundo
 * número maior que o primeiro e escolhe entre a opção par e impar, com isso o
 * código deve informar todos os números pares ou ímpares (de acordo com a
 * seleção inicial) no intervalo de números informados, incluindo os números
 * informados e em ordem decrescente;
 * 
 */

// é