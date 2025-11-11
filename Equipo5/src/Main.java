import java.util.Scanner;

public class Main {
    static int NumeroJugadores = 0;
    static String NombreEquipo;

    public static void equipos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del equipo: ");
        NombreEquipo = sc.nextLine();

        System.out.println("Introduce el numero de jugadores del equipo: ");
        NumeroJugadores = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEquipo " + NombreEquipo + " registrado con " + NumeroJugadores + " jugadores.");


        jugadores();
    }

    public static void jugadores() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= NumeroJugadores; i++) {
            System.out.println("\nJugador " + i + " del equipo " + NombreEquipo + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Dorsal: ");
            int dorsal = sc.nextInt();
            sc.nextLine();

            System.out.println("Jugador registrado: " + nombre + " " + apellido + ", Edad: " + edad + ", Dorsal: " + dorsal);
        }

        System.out.println("\nTodos los jugadores del equipo " + NombreEquipo + " han sido registrados.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n======== MENU ========\n" +
                    "1- Inscribir Equipo y Jugadores\n" +
                    "2- Salir");

            try {
                int respuesta = sc.nextInt();
                sc.nextLine();

                switch (respuesta) {
                    case 1:
                        equipos();
                        break;
                    case 2:
                        salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("No has escogido una opción correcta.");
                sc.nextLine();
            }
        }
    }
}
