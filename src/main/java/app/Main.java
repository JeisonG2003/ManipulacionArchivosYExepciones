package app;

import gestor.GestorDeArchivo;
import excepciones.ArchivoVacioException;
import validacion.ValidadorArchivo;

/**
 * Clase principal que demuestra la lectura, escritura y validación de archivos.
 */
public class Main {
    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        String archivo = "archivoDemo.txt";
        String contenido = "- Contenido del archivo creado para la práctica de manipulación de archivos .txt\n"
                + "- Este texto sirve como ejemplo para verificar la lectura y escritura de datos.";

        // Guardar el contenido en el archivo
        gestor.guardar(archivo, contenido);

        // Leer el contenido del archivo
        String textoLeido = gestor.leer(archivo);
        System.out.println("Contenido del archivo:\n" + textoLeido);

        // Verificar si el archivo está vacío
        try {
            validador.verificarNoVacio(archivo);
            System.out.println("El archivo cuenta con datos registrados.");
        } catch (ArchivoVacioException ave) {
            System.out.println("Excepción: " + ave.getMessage());
        }
    }
}
