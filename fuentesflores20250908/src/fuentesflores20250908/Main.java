/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesflores20250908;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        int cantidad_elementos = 5;
        
        //
        int [] numeros_desordenados = new int [cantidad_elementos];
        
        //
        int [] numeros_ordenados = new int [cantidad_elementos];
        
        //
        Scanner scanner = new Scanner (System.in);
        
        //
        System.out.println("Por favor ingrese "+cantidad_elementos+"numeros enteros de manera desordenada");
        
        //
        //
        for (int i = 0; i<numeros_desordenados.length; i++) {
            
            //
            System.out.print("Digite el elementos: "+(i+1)+": ");
            
            //
            numeros_desordenados[i] = scanner.nextInt();
            
        }
        
        //
        System.out.println("Usted digito los siguientes numeros");
        
        //
        for(int j =0; j < numeros_desordenados.length; j++){
            
            //SE IMPRIMEN LOS NUMEROS DIGITADOS POR EL USUARIO
            //ALMACENADOS EN EL ARREGLO DE NUMEROS DESORDENADOS
            System.out.print(numeros_desordenados[j]+" ");
            
        }
        
        //
        System.out.println();
        
        //
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //
        System.out.print("Los numeros ordenados son: ");
        
        System.out.println();
        
        //
        //
        for(int k = 0; k < numeros_ordenados.length; k++){
            
            //
            System.out.print(numeros_ordenados[k]+" ");
            
        }
        
        System.out.println();
        
    }
    
    
    //
    public static int[] ordenar( int[] arreglo ){
        
        //
        for(int i=0; i < arreglo.length - 1; i++){
            
            //
            //
            for(int j=0; j<arreglo.length - 1; j++){
                
                //
                //
                if(arreglo[j] > arreglo[j+1]){
                    
                    //
                    //
                    int mayor = arreglo[j];
                    
                    //
                    arreglo[j] = arreglo[j+1];
                    
                    //SE INTERAMBIA LA POSICION DEL SIGUIENTE ELEMENTO
                    //
                    arreglo[j+1] = mayor;
                    
                }
                
            }
            
            
            
        }
              
        return arreglo;
        
    }
    
}
