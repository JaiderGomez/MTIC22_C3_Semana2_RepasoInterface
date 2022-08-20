public class Perro extends Animal implements Mascotas{

    private int edad;
    private String nombre_perro;
    private String raza;

    public Perro(String tipo, String nombre, int edad, String nombre_perro, String raza) {
        super(tipo, nombre);
        this.edad = edad;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
    }

    @Override
    public void bañar() {
        System.out.println("Bañando a: "+this.nombre_perro);


    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando a: "+this.nombre_perro);

    }

    @Override
    public void comer() {
        System.out.println(this.nombre_perro+" Esta comiendo");

    }

    @Override
    public void respirar() {
        System.out.println(this.nombre_perro+" Esta Respirando");

    }
}
