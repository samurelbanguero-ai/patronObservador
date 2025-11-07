public class AppMovil implements Observador {
    private String usuario;

    public AppMovil(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void actualizar(String posicion) {
        System.out.println("[App de " + usuario + "] El bus está en: " + posicion);
    }
}
