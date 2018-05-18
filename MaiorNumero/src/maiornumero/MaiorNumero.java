/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;

import java.util.Random;

/**
 *
 * @author Lucas Cyrne Ferreira
 */
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int n1 = (int) (1+Math.random()*1000);
   int n2 = (int) (1+Math.random()*1000);
   if (n1<n2) {
       System.out.println(n2 + " é maior do que " + n1);
   } else {
       System.out.println(n1 + " é maior do que " + n2);
   }
          
     
        
        
     
     
        
    }
    
}
