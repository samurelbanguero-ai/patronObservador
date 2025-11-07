import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos iniciales
        System.out.print("Ingrese el nombre de la ruta del bus: ");
        String ruta = sc.nextLine();

        System.out.print("Ingrese su nombre (usuario de la app): ");
        String nombreUsuario = sc.nextLine();

        // Crear el bus y observadores
        Bus bus = new Bus(ruta);

        Observador pantalla = new PantallaEstacion("Terminal Norte");
        Observador appUsuario = new AppMovil(nombreUsuario);
        Observador control = new CentroControl();
        Observador estadisticas = new SistemaEstadisticas();

        // Suscripción de observadores
        bus.agregarObservador(pantalla);
        bus.agregarObservador(appUsuario);
        bus.agregarObservador(control);
        bus.agregarObservador(estadisticas);

        // Simulación de movimiento
        System.out.println("\n--- SIMULADOR DE POSICIÓN DEL BUS ---");
        System.out.println("Escriba la posición actual del bus (o 'salir' para terminar):");

        while (true) {
            System.out.print("\nNueva posición: ");
            String posicion = sc.nextLine();

            if (posicion.equalsIgnoreCase("salir")) {
                System.out.println("\nSimulación finalizada. 🚍");
                break;
            }

            bus.setPosicion(posicion);
        }

        sc.close();
    }
}
