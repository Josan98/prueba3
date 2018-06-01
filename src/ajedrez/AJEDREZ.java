/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Josan
 */
public class AJEDREZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int vector [][] = new int [8][8];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                vector[i][j]=0;
                
            }
// el 3 representaia las amenazadas el 1 las torres y el 0 las que no estan amenazadas;
        }
        //hola mundo
        int cont =0;
        while (cont!=6) {
            
        num1=(int)(Math.random()*(9-1));
        num2=(int)(Math.random()*(9-1));
            
        if (vector [num1][num2]==0) {
           
                
            
                vector [num1][num2]=1;
                for (int i = 0; i < vector.length; i++) {
                   
                        if (vector [num1][i]!=1) {
                           vector [num1][i]=3; 
                        }
                        if ( vector [i][num2]!=1) {
                            vector [i][num2]=3;
                        }
                       
                    
                    
                }
                cont++;
               
            }

        }
       int contam =0;
      int contsin = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                System.out.print(vector[i][j] + " ");
                if (vector [i][j]==3) {
                    contam++;
                }
                if (vector [i][j]==0) {
                    contsin++;
                }
            }
            System.out.println();
        }
       
        System.out.println("Casillas amenazadas:" + contam);
        System.out.println("Casillas  no amenazadas" + contsin);
        
    }
    
}
