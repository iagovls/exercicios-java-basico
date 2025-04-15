import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        Double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        Double altura = scanner.nextDouble();
        scanner.close();
        calcularArea(base, altura);
    }

    public static void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("A base do retângulo é " + area);
    }
}
