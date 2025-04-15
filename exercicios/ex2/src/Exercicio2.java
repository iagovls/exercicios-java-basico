import java.io.Console;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        Double altura = Double.parseDouble(System.console().readLine()); // 1.70

        System.out.println("Digite seu peso:");
        Double peso = Double.parseDouble(System.console().readLine());

        calcularIMC(altura, peso); // parâmetros
    }

        static void calcularIMC(double altura, double peso) {
        Double imc = peso/(altura * altura); 
        
        imc = Math.round(imc * 10.0)/10.0;

        System.out.println(imc);

        System.out.println("=========");
        System.out.printf("IMC: %.1f%n", imc); // ele poe o format sozinho
        

        if (imc <= 18.5) {
            System.out.println(". Abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("IMC: " + imc + "Peso ideal."); // 
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("IMC: " + imc + "Levemente acima do peso.");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("IMC: " + imc + "Obesidade Grau I.");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("IMC: " + imc + "Obesidade Grau II (Severa).");
        } else if (imc >= 40.0) {
            System.out.println("IMC: " + imc + "Obesidade III (Mórbida).");
        }
        else {
            System.out.println("IMC: " + imc + "Valor inválido.");
        }
    }

    
}

// como comentar tudo de vez?
/* 
 * 
 - Se for menor ou igual a 18,5 "Abaixo do peso";
 - se for entre 18,6 e 24,9 "Peso ideal";
 - Se for entre 25,0 e 29,9 "Levemente acima do peso";
 - Se for entre 30,0 e 34,9 "Obesidade Grau I";
 - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

 */
