public class TestaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.dormir();
        animal.fazerBarulho();

        System.out.println("");

        Cachorro cachorro = new Cachorro();
        cachorro.dormir();
        cachorro.enterrarOsso();
        cachorro.fazerBarulho();

        System.out.println("");

        Animal a1 = new Cachorro();
        a1.dormir();
        a1.fazerBarulho();

        Animal a2 = new Galinha();
        a2.dormir();
        a2.fazerBarulho();
    }
}
