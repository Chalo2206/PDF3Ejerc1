package pdf3ejer1;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class PDF3Ejer1 {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);        
        int numeros[] = new int [10]; // arreglo
        numeros[0] = 5;
        numeros[1] = -9;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = -1;
        numeros[5] = 10;
        numeros[6] = -12;
        numeros[7] = 2;
        numeros[8] = 8;
        numeros[9] = 20;
        
        int pos = 0; //varible
        
        for(int i =0;i< numeros.length; i++){
        
//        System.out.print("Introduce el Numero "+(i+1)+" : ");
//        numeros[i] = N.nextInt();
        if(numeros[i]>0){
            pos++;
        }
        }
        System.out.println("Los numeros positivos son : "+pos );
        
    }
    
}
