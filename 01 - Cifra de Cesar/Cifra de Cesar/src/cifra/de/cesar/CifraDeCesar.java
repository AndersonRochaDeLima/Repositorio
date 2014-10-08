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
public class CifraDeCesar {
    //a: 97    A: 65
    //z: 122   Z: 90
    
     
    public String codifica(String palavra_Codificada, int k){       
        String auxiliar="";
        int maior;
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i=0; i < palavra_Codificada.length(); i++){
            
            if((palavra_Codificada.charAt(i) + k) > 'z'){    //z + 2 > z   (ok)
                maior = palavra_Codificada.charAt(i) + k; // maior = z + 2 = 124
                auxiliar = auxiliar+(char)(alfabeto.charAt(0) + (maior -122 - 1));  //auxiliar = a + (124 - 122 - 1) = 
            }
            else{
                //System.out.print("\nNão Passou de Z");
                auxiliar = auxiliar + (char)(palavra_Codificada.charAt(i) + k);
            }
        }
        System.out.print("\nCodificada: " + auxiliar);
        return auxiliar;
    }
    
    public void descodifica(String palCod, int k){
        System.out.print("\n\nValor: " + palCod + "\nChave: " + k );
        int decifrada = 0;
        
        for(int i=0; i < palCod.length(); i++){
            System.out.print("\n\nPalCod: " + palCod.charAt(i));
            decifrada = (char) (palCod.charAt(i) - k);
            
            System.out.println("DDDDD: " + decifrada);
            
            while(decifrada < 32){
                decifrada = decifrada + 94;
            }
        }
        System.out.print("\n\nDecifrada: "+ decifrada);
        
    }
}
