public class Main {
    public static void main(String[] args) {

        Perro miperro = new Perro("Mamifero", "Perro", 5, "Paco", "Bulldog");

        System.out.println("Metodos del padre: ");
        miperro.nacer();
        miperro.comer();
        miperro.respirar();

        System.out.println("Metodos de interfaz: ");
        miperro.bañar();
        miperro.vacunar();

    }
}
