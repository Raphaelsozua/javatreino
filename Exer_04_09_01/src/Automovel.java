public class Automovel extends Veiculo{
    @Override
    public void listarVerificacoes() {
        System.out.println("Listando verificacoes do veiculo");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando veiculo");
    }

    @Override
    public void limpar() {
        System.out.println("Limpando veiculo");
    }
    public void Trocaroleo(){
        System.out.println("Trocando de oleo");
    }
}
