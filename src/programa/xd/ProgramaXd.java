/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.xd;
import java.util.Scanner;
/**
 *
 * @author ALUMNO
 */
public class ProgramaXd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int n1,n2, n3, n4, num, num2,filas, columnas;
        System.out.println("Ingrese los valores de las filas");
        filas=teclado.nextInt();
        System.out.println("Ingresa los valores en las columnas");
        columnas=teclado.nextInt();
            int matrizA[][]=new int[filas][columnas];
            int matrizB[][]=new int[filas][columnas];
            int matrizRes[][]=new int[filas][columnas];
            
        System.out.println("SUMA DE 2 MATRICES");
        
        System.out.println("Matriz A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                num=teclado.nextInt();
                matrizA[i][j]=num;
            }
        }
        System.out.println("Matriz B");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                num=teclado.nextInt();
                matrizB[i][j]=num;
            }
        }
        System.out.println("Matriz Resultante");
                for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRes[i][j]=matrizA[i][j]+matrizB[i][j];
                System.out.print(matrizRes[i][j]+" ");
                

            }
            System.out.println();

        }       
    }
        // TODO code application logic here
}
    

