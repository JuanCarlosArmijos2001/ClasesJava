package Parque_Tematico;

public class Atraccion {
    String tema = "";
    String atraccion = "";
    boolean reservado = false;
    int numVisitantes = 0;
    boolean disponible = true;

    public String registrarAtraccion(String tema, String atraccion, int numeroVisitantes) {
        this.tema = tema;
        this.atraccion = atraccion;
        this.numVisitantes = numeroVisitantes;
        return "Tema: " + tema + "\nAtraccion: " + atraccion + "\nEste parque admite: " + numeroVisitantes;
    }

    public void mostrarAtraccion () {
        System.out.println("Tema: " + tema);
        System.out.println("Atraccion: " + atraccion);
        System.out.println("Numero de Visitantes maximos: " + numVisitantes);
    }

}
