public class AnimalDomestico extends Animal {

    private String raza;
    private boolean isVacunado;
    private Tipo tipo;

    public AnimalDomestico(int id, String nombre, int edad, double peso, String raza, boolean isVacunado, Tipo tipo) {
        super(id, nombre, edad, peso);
        this.raza = raza;
        this.isVacunado = isVacunado;
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return isVacunado;
    }

    public void setVacunado(boolean isVacunado) {
        this.isVacunado = isVacunado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + " [" + super.toString() + ", raza=" + raza + ", isVacunado=" + isVacunado + "]";
    }
    
    @Override
    public void revision() {
        if (!isVacunado) {
            isVacunado = true;
            System.out.println("Vacunado correctamente");
        } else
            System.out.println("Esta vacunado");
    }
}
