public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite seu nome:");
        String nome = System.console().readLine();
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(System.console().readLine());
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        exibirMensagem(nome, idade);
    }

    public static void exibirMensagem(String nome, int idade) {
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}
