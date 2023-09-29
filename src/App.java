import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Tienda> tiendas = new LinkedList<>();

        // Tiendas
        Tienda tienda = new Tienda(0, "Madrid");
        Tienda tienda2 = new Tienda(1, "Barcelona");
        tiendas.add(tienda);
        tiendas.add(tienda2);

        // Animales
        Pajaro pajaro = new Pajaro(0, "pajaro", 10, 20, "Loro", 20);
        Pajaro pajaro2 = new Pajaro(1, "pajaro1", 12, 10, "Loro", 20);
        AnimalDomestico perro = new AnimalDomestico(2, "perro", 20, 20, "Bodeguero", true, Tipo.PERRO);
        AnimalDomestico perro2 = new AnimalDomestico(2, "perro1", 15, 20, "Mezcla", false, Tipo.PERRO);
        AnimalDomestico gato = new AnimalDomestico(3, "gato", 10, 10, "Persa", true, Tipo.GATO);
        AnimalDomestico gato2 = new AnimalDomestico(4, "gato1", 10, 10, "Mixto", false, Tipo.GATO);
        Pez pez = new Pez(0, "pez", 5, 1, "Rojo", 5);
        Pez pez2 = new Pez(6, "pez1", 2, 1, "Azul", 1);
        tienda.addAnimal(pajaro);
        tienda2.addAnimal(pajaro2);
        tienda.addAnimal(perro);
        tienda2.addAnimal(perro2);
        tienda.addAnimal(gato);
        tienda2.addAnimal(gato2);
        tienda.addAnimal(pez);
        tienda.addAnimal(pez2);

        tienda2.registrarAnimal();

        try{
            menu(null);
        } catch(NullPointerException e){
            System.out.println("El valor de la llamada es nulo");
        }
        
    }

    //Menu
    public static void menu(LinkedList<Tienda> tiendas) {
        //Scanners
        Scanner ent = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        int opc = 0;
        String opc1 = "";

        do {
            System.out.println("-- GESTIÓN TIENDAS --");
            System.out.println("1. Mostrar listas de tiendas");
            System.out.println("2. Salir");
            opc = ent.nextInt();
            switch (opc) {
                //Mostrar Tienda
                case 1:
                    System.out.println("Mostrando lista de tiendas disponibles...");
                    for (Tienda t : tiendas) {
                        System.out.println(t.toString());
                    }
                    System.out.println("Elige el id de la tienda que quieres gestionar: ");
                    int id = ent.nextInt();

                    for (int i = 0; i < tiendas.size(); i++) {
                        if (tiendas.get(i).getId() == id) {
                            do {
                                System.out.println("GESTION DE " + tiendas.get(i).toString());
                                System.out.println("-- OPCIONES --");
                                System.out.println("a. Nuevo Animal");
                                System.out.println("b. Vender Animal");
                                System.out.println("c. Revisar Animales");
                                System.out.println("d. Mostrar Animales");
                                System.out.println("e. Volver");
                                opc1 = str.nextLine();
                                switch (opc1) {
                                    case "a","A":
                                        tiendas.get(i).registrarAnimal();
                                        break;
                                    case "b","B":
                                        tiendas.get(i).venderAnimal();
                                        break;
                                    case "c","C":
                                        for (int j = 0; j < tiendas.get(i).getAnimales().size(); j++)
                                            tiendas.get(i).getAnimales().get(j).revision();
                                        break;
                                    case "d","D":
                                        for (int j = 0; j < tiendas.get(i).getAnimales().size(); j++)
                                            System.out.println(tiendas.get(i).getAnimales().get(j).toString());
                                        break;
                                    case "e","E":
                                        System.out.println("Volviendo...");
                                        break;
                                    default:
                                        System.out.println("ERROR: Opción erronea");
                                        break;
                                }
                            } while (!opc1.equals("e"));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("ERROR: Opción no valida");
                    break;
            }
        } while (opc != 2);
    }
}
