public class CentroControl implements Observador {
    @Override
    public void actualizar(String posicion) {
        System.out.println("[Centro de Control] Actualización recibida: " + posicion);
    }
}
