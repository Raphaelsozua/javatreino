public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }


    @Override
    public void depositar(double valor){
        super.depositar(valor -0.10);
    }
    @Override
    public void atualizaTaxa(double taxa){
        super.atualizaTaxa(taxa *3);
    }

}
