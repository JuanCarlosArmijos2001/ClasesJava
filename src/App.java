import java.util.Scanner;
import Parque_Tematico.Atraccion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------- SISTEMA DE RESERVAS PARA UN PARQUE ----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Parque Tematico");
        System.out.println("2. Entradas");
        System.out.println("3. Reservas");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("1. Registrar Atraccion");
                System.out.println("2. Registrar Visitante");
                System.out.println("3. Crear Reserva");
                System.out.println("4. Disponibilidad");
                switch (opcion) {
                    case 1:
                        Atraccion atraccion = new Atraccion();
                        atraccion.registrarAtraccion("Parque Jurasico", "Montania Rusa en forma de dinosaurio", 100);
                        atraccion.mostrarAtraccion();
                        
                        break;
                
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
    }
}
