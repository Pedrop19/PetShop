
public abstract class Animal {
    private int id;
    private int edad;
    private String nombre;
    private double peso;
    
    public Animal(int id, String nombre, int edad, double peso) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void revision();
    
    @Override
    public String toString() {
        return "id=" + id + ", nombre" + nombre + ", edad=" + edad + ", peso=" + peso;
    }

    
}
