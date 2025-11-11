import java.util.Scanner;
public class Main {
    static int NumeroJugadores = 0;
    public static void equipos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el nombre de la equipo: ");
    String NombreEquipo = sc.nextLine();
    System.out.println("Introduce el numero de jugadores del equipo: ");
    NumeroJugadores = sc.nextInt();
    }
    public static void jugadores(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= NumeroJugadores; i++) {
            System.out.println("\nJugador " + i + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Dorsal: ");
            int dorsal = sc.nextInt();
            sc.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== MENU ======== \n" +
                "1- Inscribir Equipo \n" +
                "2- Inscribir Jugadores");
        try {
            int respuesta = sc.nextInt();
            if (respuesta == 1) {
                equipos();
            }
            if (respuesta == 2) {
                jugadores();
            }
        }
        catch(Exception e) {
            System.out.println("no has escogido una opcion correcta");
        }

        }
    }
