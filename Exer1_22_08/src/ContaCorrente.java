public class ContaCorrente extends Conta{
    public ContaCorrente(double saldo) {
        super(saldo);
    }



    @Override
    public void atualizaTaxa(double taxa){
        super.atualizaTaxa(taxa *2);
    }

}
