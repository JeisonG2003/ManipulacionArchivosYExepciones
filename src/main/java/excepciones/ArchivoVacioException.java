package excepciones;

/**
 * Excepción personalizada para indicar que un archivo está vacío.
 */
public class ArchivoVacioException extends Exception {
    public ArchivoVacioException(String mensaje) {
        super(mensaje);
    }
}
