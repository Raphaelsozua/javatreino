public interface Banco {
    public abstract boolean saque(Conta conta, double valor);
    public abstract boolean deposito(Conta conta, double valor);
    public abstract void extrato (Conta conta);
}
