import java.util.ArrayList;
import java.util.List;

public class Bus implements Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private String posicion;
    private String ruta;

    public Bus(String ruta) {
        this.ruta = ruta;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
        System.out.println("\n[Bus " + ruta + "] Nueva posición: " + posicion);
        notificarObservadores();
    }

    @Override
    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void eliminarObservador(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.actualizar(posicion);
        }
    }
}
