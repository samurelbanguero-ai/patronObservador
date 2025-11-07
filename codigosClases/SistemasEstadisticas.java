public class SistemaEstadisticas implements Observador {
    @Override
    public void actualizar(String posicion) {
        System.out.println("[Sistema de Estadísticas] Registrando posición: " + posicion);
    }
}
