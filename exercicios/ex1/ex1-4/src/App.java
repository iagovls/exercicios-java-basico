public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o primeiro nome:");
        System.out.println("Digite a primeira idade:");
        System.out.println("Digite o segundo nome:");
        System.out.println("Digite a segunda idade:");
        calcularDiferencaIdade(firstage, secondage);
        
    }

    public static void calcularDiferencaIdade(int firstage, int secondage) {
        int diferenca = Math.abs(firstage - secondage);
        System.out.println("A diferença de idade é: " + diferenca + " anos.");
    }
}
