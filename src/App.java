import java.util.Arrays;
import java.util.List;

import archivoob.ElemenPersona;
import archivoob.Persona;

//debo importar los elementos para el ejemplo de la diapositiva 18 ojo

public class App {
    public static void main(String[] args) throws Exception {
        
        // var archivo=new Ejemplo4();
        // //archivo.escribir("ejemploG18"); 
        // archivo.escribir("ejemploG18_comma.txt");
        
        var ep=new ElemenPersona();
        //puedo generar personas.dat, personas.txt, personas.obj
        ep.guardarP("Personas.txt",
                // convertir a list
                Arrays.asList(
                new Persona("552871883","María", "Ruiz Ramos"),
                new Persona("403020104","Juan", "González López"),
                new Persona("441234789","Luis", "Perez"),
                new Persona("441234789","Luis", "Perez")
                )); //Si voy agregando nuevos elementos, cambia la serie de los objetos. Si no los modifico, la serialización queda igual
                //archivoob.Persona@573fd745
                //archivoob.Persona@15327b79
                //archivoob.Persona@4f2410ac
                //archivoob.Persona@722c41f4
                
        List<Persona> personas=ep.cargarPersonas("Personas.txt");
        personas.forEach(System.out::println);
        
        //Ejercicio1.run_Eje1();
}
}