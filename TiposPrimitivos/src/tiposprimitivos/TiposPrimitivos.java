/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;



/**
 *
 * @author Lucas Cyrne Ferreira
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int idade = 30;
        String valor = idade;
        
        teclado.nextLine()
        String nome = "Lucas";
        float nota = 8.5f;
        System.out.format("A nota de %s é %.2f ", nome, nota);
        
    }
    
}
