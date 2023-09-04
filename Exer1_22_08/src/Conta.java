public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void atualizaTaxa(double taxa){
        saldo += saldo * (taxa /100);
    }

}
