import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Tienda {
    private int id;
    private String ubicacion;
    private LinkedList<Animal> animales;

    public Tienda(int id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.animales = new LinkedList<Animal>();
    }

    public void addAnimal(Animal a){
        animales.add(a);
    }

    public void removeAnimal(Animal a){
        animales.remove(a);
    }

    public void registrarAnimal() {
        Scanner ent = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        try{        
            System.out.println("-- REGiSTRANDO ANIMAL --");
            System.out.println("Introduce el id del animal: ");
            int id = ent.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Debes introducir un numero");
        }

        System.out.println("Introduce el nombre del animal: ");
        String nombre = str.nextLine();
        System.out.println("Introduce la edad del animal: ");
        int edad = ent.nextInt();
        System.out.println("Introduce el peso: ");
        double peso = ent.nextDouble();
        System.out.println("¿Qué animal quieres registrar? [1-4]");
        System.out.println("1. Pájaro 2. Animal Domestico [Perro o Gato] 4. Pez");
        switch (ent.nextInt()) {
            case 1:
                System.out.println("-- REGISTRANDO PAJARO --");
                System.out.println("Introduce la especie: ");
                String especie = str.nextLine();
                System.out.println("Introduce el peso ideal: ");
                double pesoIdeal = ent.nextDouble();
                animales.add(new Pajaro(id, nombre, edad, peso, especie, pesoIdeal));
                break;
            case 2:
                System.out.println("-- REGISTRANDO ANIMAL DE COMPAÑIA [PERRO O GATO] --");
                System.out.println("¿Qué tipo quiere registrar? [1. Perro 2.Gato]");
                Tipo tipo = null;
                switch (ent.nextInt()) {
                    case 1:
                        tipo = Tipo.PERRO;
                        break;
                    case 2:
                        tipo = Tipo.GATO;
                        break;
                    default:
                        System.out.println("ERROR: Opcion no valida");
                        break;
                }
                System.out.println("Introduce la raza: ");
                String raza = str.nextLine();
                System.out.println("Esta vacunado? [y/n]");
                boolean isVacunado = str.nextLine().equals("y");
                animales.add(new AnimalDomestico(id, nombre, edad, peso, raza, isVacunado, tipo));
                break;
            case 4:
                System.out.println("-- REGISTRANDO PEZ --");
                System.out.println("Introduce el color: ");
                String color = str.nextLine();
                System.out.println("Introduce el pH ideal: ");
                int phIdeal = ent.nextInt();
                animales.add(new Pez(id, nombre, edad, peso, color, phIdeal));
                break;
            default:
                System.out.println("ERROR: Opción no valida");
                break;
        }
    }

    public void venderAnimal() {
        Scanner ent = new Scanner(System.in);
        System.out.println("-- VENDIENDO ANIMAL --");
        System.out.println("Mostrando animales...");
        System.out.println(animales.toString());
        System.out.println("Introduce el id del animal a borrar: ");
        int idAnimal = ent.nextInt();
        boolean existe = false;
        int i = 0;
        while (i < animales.size() && !existe) {
            if (animales.get(i).getId() == idAnimal) {
                animales.remove(i);
                existe = true;
                System.out.println("Animal " + idAnimal + " vendido correctamente");
            } else
                i++;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LinkedList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(LinkedList<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "Tienda [id=" + id + ", ubicacion=" + ubicacion + "]";
    }
}
