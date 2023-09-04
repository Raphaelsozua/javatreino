public class Assistente extends Funcionario{
    private int matricula ;
    public Assistente(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void imprimir(){
        System.out.println("nome do assistente: " +getNome()+ "," +
                " matricula do assistente: "+ getMatricula());
    }
}
