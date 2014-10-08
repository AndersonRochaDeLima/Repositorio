/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.de.cesar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a palavra: ");
        String palavra = entrada.nextLine();
        
        System.out.println("Digite o valor de k: ");
        int k = entrada.nextInt();
        
        CifraDeCesar c = new CifraDeCesar();
        String palCod = c.codifica( palavra, k);
        
        CifraDeCesar d = new CifraDeCesar();
        d.descodifica(palCod, k);
        
    }
}
