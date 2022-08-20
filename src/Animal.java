public abstract class Animal {
    private String tipo;
    private String nombre;

    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    //Metodos Getter y Setters


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo Abstracto

    public abstract void comer();
    public abstract void respirar();

    //Metod normal
    public void  nacer(){
        System.out.println("Nacimiento del Animal...");

    }
}
