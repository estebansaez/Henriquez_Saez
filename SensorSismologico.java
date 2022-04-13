import java.util.Scanner;

public class SensorSismologico {
    public static void main(String[] args) {
        cantidadDias();
        fechaSismo();
        Menu();
        opcionesMenu();
    }

    public static int cantidadDias() {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese los días a registrar: ");
        n = leer.nextInt();

        if(n>=2 && n<=31) {
            System.out.println("Error, ingrese los datos nuevamente");
        }
        return cantidadDias();
    }

    public static int fechaSismo() {
        int DD=0;
        int HH=0;
        int MAX=0;
        System.out.println("El día "+DD+", a las "+HH+" se registra sismo más intenso, con un valor de "+MAX+" en la escala de Richter.");
        return fechaSismo();
    }

    public static void Menu() {
        Scanner leer = new Scanner(System.in);
        int opcionMenu;
        System.out.println("------MENU------");
        System.out.println("¿Desea volver a alguna de las opciones anteriores");
        System.out.println("1. Mostrar sismo más intenso");
        System.out.println("2. Mostrar sisimos >= 4.0 grados Richter");
        System.out.println("3. Reiniciar el arreglo con nuevos valores");
        opcionMenu = leer.nextInt();

    }

    public static int opcionesMenu() {
        int opcionMenu=0;
        switch (opcionMenu) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

        return opcionesMenu();
    }
}
