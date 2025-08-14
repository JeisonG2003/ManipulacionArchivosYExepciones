package validacion;

import excepciones.ArchivoVacioException;
import java.io.*;

/**
 * Clase que valida el contenido de un archivo.
 */
public class ValidadorArchivo {

    /**
     * Verifica que un archivo no esté vacío.
     * @param nombreArchivo Nombre del archivo a verificar.
     * @throws ArchivoVacioException Si el archivo no tiene contenido.
     */
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            if (br.readLine() == null) {
                throw new ArchivoVacioException("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al verificar archivo: " + e.getMessage());
        }
    }
}
