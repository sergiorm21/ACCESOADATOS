/*Sergio Reina Montes*/
package UDActividad5;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);
    static RandomAccessFile archivo = null;

    public static void main(String[] args) {
        
        int nentero;
        try{
            archivo = new RandomAccessFile("C:\\Users\\reina.moser\\Documents\\NetBeansProjects\\AccesoADatos\\src\\UDActividad5\\datos.dat", "rw");
            viewFile();
            System.out.println("Introduce un numero entero por teclado: ");
            nentero = sc.nextInt();
            archivo.seek(archivo.length());
            archivo.writeInt(nentero);
            viewFile();
            
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if (archivo != null){
                    archivo.close();
                }
            }catch (IOException e2){
                System.out.println(e2.getMessage());
            }
        }

    }
    
    public static void viewFile(){
        int n;
        
        try{
            archivo.seek(0);
            while (true){
                n = archivo.readInt();
                System.out.println(n);
            }
        }catch (EOFException e2){
            System.out.println("Termina el archivo.");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
