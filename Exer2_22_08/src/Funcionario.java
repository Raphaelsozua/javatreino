public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void imprimir(){
        System.out.println("Nome do funcionario: " + getNome());
    }
}
