import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        
        int num2;
        do {
            System.out.println("Informe um número para ser dividido pelo primeiro número:");
            num2 = scanner.nextInt();

            double resultado = num2 / num1;
            
            resultado = Math.round(resultado * 100.0) / 100.0;
            
            System.out.println(resultado); // 
            if (num2 % num1 != 0) {
                break;
            }
        } while (true);
        
    }
}

/*4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados */