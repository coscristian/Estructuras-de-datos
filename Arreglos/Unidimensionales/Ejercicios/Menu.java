import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public int crearMenu() {
        System.out.println(".: MENU PRINCIPAL :.");
        System.out.println("0. Salir");
        System.out.println("7. Ejercicio 7");
        System.out.println("7.1. Ejercicio 7.1 (71)");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("¿Qué opción desea seleccionar?: ");
        
        int opcion = sc.nextInt();
        //sc.close();
        
        return opcion;
    }
}
