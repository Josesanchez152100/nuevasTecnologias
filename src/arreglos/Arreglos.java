/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros=new int[4];
        
        /*numeros[0]=1;
        numeros[1]=1;
        numeros[2]=1;
        numeros[3]=1;*/
        
        for(int i=0; i<numeros.length; i++){
            System.out.println("Digita el dato: "+i);
            numeros[i]=entrada.nextInt();
        };
        
        System.out.println("**************");
        
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        };
        
        
        String producto1="cocacola";
        String producto2="papa";
        String producto3="arroz";
        String producto4="cañon de cerdo";
        String producto5="pancitos pequeños";
        String producto6="piña";
        
    }
    
}
