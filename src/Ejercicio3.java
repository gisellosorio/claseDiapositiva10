import javax.swing.JOptionPane;
import java.io.*;
 
public class Ejercicio3{
 
    public static void main(String[] args) {
 
        final String Ubic="C:\\Users\\Gisell\\OneDrive\\Escritorio\\PROYECTOS 2022\\Mision TIC\\Ciclo 2\\Programación básica\\Semana 5\\Clase 13\\claseDiapositiva10#clasediapositiva10-1\\vehiculos11.txt";
 
        String m=JOptionPane.showInputDialog("Matricula del Vehiculo");
        String mar=JOptionPane.showInputDialog("Marca del Vehiculo");
        String dep=JOptionPane.showInputDialog("Tamaño del deposito del Vehiculo");
        String mo=JOptionPane.showInputDialog("Modelo del Vehiculo");
        //Método para convertir una cadena en un doble
        double tamDep=Double.parseDouble(dep); //dep se debe declarar como String porque el método showInputDialog sólo recibe string
       
        //DataOutputStream
        //Se crea un objeto de la clase DataInputStream vinculándolo a un un objeto FileInputStream para leer desde un archivo
        try(DataOutputStream salida=new DataOutputStream(new FileOutputStream(Ubic,true));
                DataInputStream entrada=new DataInputStream(new FileInputStream(Ubic))){
 
            introduceDatos(salida, m, mar, tamDep, mo);
 
            muestraDatos(entrada);
        }catch(EOFException e){//Excepcion cuando se alcanza el final del archivo del objeto
 
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
 
    public static void introduceDatos(DataOutputStream salida,
                                        String m,
                                        String mar,
                                        double tamDep,
                                        String mo) throws IOException{
 
        //escribe una cadena en el flujo de salida mediante la codificación UTF-8 
        salida.writeUTF(m);
        salida.writeUTF(mar);
        salida.writeDouble(tamDep);
        salida.writeUTF(mo);
 
    }
 
    public static void muestraDatos(DataInputStream entrada) throws IOException {
 
        //Cuando se acabe el fichero saltara la excepcion
        while(true){
            JOptionPane.showMessageDialog(null, "Vehiculo con matricula "+entrada.readUTF()+
            ", su marca es "+entrada.readUTF()+", tamaño del deposito es de "+entrada.readDouble()+" " +
            "y su modelo es "+entrada.readUTF());
        }
    }
 
}