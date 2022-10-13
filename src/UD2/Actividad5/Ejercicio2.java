/*Sergio Reina Montes*/
package accesoadatos.UD2.Actividad5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        
        int crear = 0;
        int mostrar = 0;
        int escribir = 0;
        int salir = 0;
        
        System.out.println("Bienvenido, selecciona lo que quieres hacer.");
        
        
        do{
            System.out.println("1 - Crear un fichero.");
            System.out.println("2 - Mostrar contenido de un fichero.");
            System.out.println("3 - Escribir al final de un fichero.");
            System.out.println("4 - Salir.");
            
            switch (crear){
                case 1:
                    try{
                        if(!file.exists()){
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new
                    }
                    
            }
        }
            
    }
    
}
