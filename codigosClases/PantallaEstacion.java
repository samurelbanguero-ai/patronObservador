public class PantallaEstacion implements Observador {
    private String nombreEstacion;

    public PantallaEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    @Override
    public void actualizar(String posicion) {
        System.out.println("[Pantalla " + nombreEstacion + "] Bus acercándose: " + posicion);
    }
}
