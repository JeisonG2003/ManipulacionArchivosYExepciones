package gestor;

import java.io.*;

/**
 * Clase que gestiona operaciones de lectura y escritura de archivos de texto.
 */
public class GestorDeArchivo {
    
    /**
     * Guarda el contenido recibido en un archivo de texto.
     * @param nombreArchivo Nombre del archivo donde se guardará el contenido.
     * @param contenido Texto a escribir en el archivo.
     */
    public void guardar(String nombreArchivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    /**
     * Lee y devuelve el contenido de un archivo línea por línea.
     * @param nombreArchivo Nombre del archivo a leer.
     * @return Contenido completo del archivo.
     */
    public String leer(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return contenido.toString().trim();
    }
}
