

public class Exercicio1 {

    public static void main(String[] args) throws Exception {

        System.out.println("Criando a conta.");
        System.out.println("Qual o valor do primeiro depósito:");
        Banco banco = new Banco();
        banco.primeiroDeposito(Double.parseDouble(System.console().readLine()));
        
        
        while (true) { 
        System.out.println("Digite uma das 6 opções");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");
        System.out.println("7 - Consultar multa");
        System.out.println("8 - Sair");
        System.out.println("Digite a opção desejada:");

        int opcao = Integer.parseInt(System.console().readLine());
            
            switch (opcao) {
                case 1:
                
                System.out.println("Consultar saldo");
                
                System.out.println("Saldo: " + banco.getSaldo());
                
                break;
                
                case 2:
                
                System.out.println("Cheque especial: " + banco.getChequeEspecial());

                break;

                case 3:
                
                System.out.println("Digite o valor a depositar:");
                double deposito = Double.parseDouble(System.console().readLine());
                
                banco.depositar(deposito);
                
                System.out.println("Valor de R$ " + deposito + " depositado.");
                
                break;
                
                case 4:
                
                System.out.println("Digite o valor a sacar:");
                double saque = Double.parseDouble(System.console().readLine());
                banco.sacar(saque);
                
                break;
                
                case 5:
                
                System.out.println("Digite o valor a pagar:");
                double valorBoleto = Double.parseDouble(System.console().readLine());
                
                banco.sacar(valorBoleto);
                
                break;
                case 6:
                if (banco.getSaldo() < 0 ) {
                    
                    System.out.println("Usando cheque especial");
                } else {
                    System.out.println("Não está usando cheque especial");
                }   
                
                break;

                case 7:
                    System.out.println("Multa: " + banco.getMulta());
                    break;

                case 8:
                System.out.println("Saindo do programa.");
                System.exit(0);
                
                default:
                System.out.println("Opção inválida.");
            }
        }

    }
}

/*
 * 1. Escreva um código onde temos uma conta bancaria que possa realizar as
 * seguintes operações:
 * - Consultar saldo
 * - consultar cheque especial
 * - Depositar dinheiro;
 * - Sacar dinheiro;
 * - Pagar um boleto.
 * - Verificar se a conta está usando cheque especial.
 * 
 * Siga as seguintes regras para implementar
 * - A conta bancária deve ter um limite de cheque especial somado ao saldo da
 * conta;
 * - O o valor do cheque especial é definido no momento da criação da conta, de
 * acordo com o valor depositado na conta em sua criação;
 * - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque
 * especial deve ser de R$50,00
 * - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor
 * depositado;
 * - Caso o limite de cheque especial seja usado, assim que possível a conta
 * deve cobrar uma taxa de 20% do valor usado do cheque especial.
 */
