/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Lucas Cyrne Ferreira
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,5,8,2};
        System.out.println("Total de casas de N: " + n.length);
        for (int c=0; c<=8; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}