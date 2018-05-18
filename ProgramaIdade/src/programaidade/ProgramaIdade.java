/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Lucas Cyrne Ferreira
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        int i = 2018 - nasc;
        System.out.println("Sua idade é: " + i);
        if (i>=18){
            System.out.println("MAIOR");
        } else {
            System.out.println("MENOR");
        }
    }
    
}
