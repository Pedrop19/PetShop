public class Pajaro extends Animal {

    public String especie;
    public double pesoIdeal;

    public Pajaro(int id, String nombre, int edad, double peso, String especie, double pesoIdeal) {
        super(id, nombre, edad, peso);
        this.especie = especie;
        this.pesoIdeal = pesoIdeal;
    }

    public String getEspecie() {
        return null;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    @Override
    public String toString() {
        return "PAJARO [" + super.toString() + ", especie=" + especie + ", pesoIdeal=" + pesoIdeal + "]";
    }

    @Override
    public void revision() {
        if(pesoIdeal != getPeso())
            System.out.println("Hay que ponerlo a dieta");
        else
            System.out.println("Esta en su peso ideal");
    }

}
