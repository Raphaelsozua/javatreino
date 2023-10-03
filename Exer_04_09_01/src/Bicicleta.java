public class Bicicleta extends Veiculo{


    @Override
    public void listarVerificacoes() {
        System.out.println("Listando verificacoes da bicicleta");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando bicicleta");
    }

    @Override
    public void limpar() {
        System.out.println("limpando bicicleta");
    }
}
