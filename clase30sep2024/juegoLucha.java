
import java.util.Scanner;

class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    // constructor para inicializar los personajes
    public JuegoLucha(String nombre1, String nombre2) {
        this.jugador1 = new Personaje(nombre1);
        this.jugador2 = new Personaje(nombre2);
    }

    // metodo para iniciar la peleda
    public void iniciarPelea() {
        System.out.println("la pelea comienza entre" + jugador1.getNombre() + " y " + jugador2.getNombre() + "...");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        // mostrar el resultado de la pelea
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea. ");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea. ");
        }
    }

    // metodo que representa un turno de ataque
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("turno de " + atacante.getNombre() + ". puntos de vida" + defensor.getNombre() + ": "
                + defensor.getpuntosDeVida());
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getpuntosDeVida() + " puntos de vida.");
    }

    // metodo principal que ejecuta el juego
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce el nombre del jugador1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();
        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();
    }
}
