public class Animal {
    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public static void dormir(){
        System.out.println("Dormindo...");
    }
    public void fazerBarulho(){
        System.out.println("fazendo barulho...");
    }
}