public interface Sujeto {
    void agregarObservador(Observador obs);
    void eliminarObservador(Observador obs);
    void notificarObservadores();
}
