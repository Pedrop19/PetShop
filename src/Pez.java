import java.util.Scanner;

public class Pez extends Animal {

    private String color;
    private int phIdeal;

    public Pez(int id, String nombre, int edad, double peso, String color, int phIdeal) {
        super(id, nombre, edad, peso);
        this.color = color;
        this.phIdeal = phIdeal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPhIdeal() {
        return phIdeal;
    }

    public void setPhIdeal(int phIdeal) {
        this.phIdeal = phIdeal;
    }

    @Override
    public String toString() {
        return "PEZ [" + super.toString() + ", color=" + color + ", phIdeal=" + phIdeal + "]";
    }

    @Override
    public void revision() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce el pH del agua");
        int phAgua = ent.nextInt();
        if (phAgua == phIdeal)
            System.out.println("El pH del agua esta correcto");
        else {
            phAgua = phIdeal;
            System.out.println("pH corregido");
        }
    }
}
