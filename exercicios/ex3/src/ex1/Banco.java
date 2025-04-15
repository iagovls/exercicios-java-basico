
public class Banco {

    private double multa = 0;
    private double saldo = 0;
    private double chequeEspecial = 0;


    


    public static void main(String[] args) {

    }

    static void consultarSaldo(double saldo) {

        System.out.println("Saldo: R$ " + saldo);
    }

public void primeiroDeposito(double deposito) {
        saldo += deposito;
        chequeEspecial = calcularChequeEspecial(saldo);
        setChequeEspecial(chequeEspecial);
    }

    public void depositar(double deposito) {
        saldo += deposito;
        if (multa > 0 && saldo > 0) {
            saldo -= multa;
        }
        setSaldo(saldo);
    }

    public double sacar(
        double saque) {

        if (temLimiteNoChequeEspecial(
                saldo,
                chequeEspecial,
                saque)) {

            setMulta(multar(multa, saldo, saque));
            saldo -= saque;
            return saldo;
        } else {
            System.out.println("Sem limite no cheque especial.");

        }
        return saldo;
    }




    public static double calcularChequeEspecial(double saldo) {
        if (saldo <= 500) {
            return 50;
        } else {
            return saldo * 0.5;
        }
    }

    public static boolean temLimiteNoChequeEspecial(double saldo, double chequeEspecial, double saque) {
        if ((saldo - saque) < chequeEspecial * -1) {
            return false;
        } else {
            return true;
        }
    }

    public static double multar(double multa, double saldo, double saque) {
        if (saque > saldo && saldo > 0) {
            saldo -= saque;
            multa += saldo * 0.20 * -1;
            return multa;
        } else if (saldo < 0) {
            multa += saque * 0.20;
            return multa;
        } else {
            multa += 0;
            return multa;
        }
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
