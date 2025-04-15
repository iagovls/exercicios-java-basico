
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        scanner.close();
        calcularArea(lado);
    }

    public static void calcularArea(double lado) {
        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: " + area);
    }
}
