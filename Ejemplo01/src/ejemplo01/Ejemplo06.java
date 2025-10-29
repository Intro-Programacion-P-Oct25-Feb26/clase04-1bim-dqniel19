/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        String nombre = "Daniel";
        String apellido = "Vargas";
        int edad = 17;
        String direccion = "Esteban Godoy";
        String universidad = "Universidad Tecnica Particular de Loja";
        String ciclo = "1ero";
        String asignatura = "Introducción a la programación";
        String paralelo = "A";
        
        // Uso de printf
        // f: formato
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        
                System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:%d\nDirección:\n\n\t%s\n\nUniversidad:%s\nCiclo:%s\nAsignatura:%s\nParalelo:\n\t%s\n", 
                        nombre, apellido, edad, direccion, universidad, ciclo, asignatura, paralelo);
    }
}
