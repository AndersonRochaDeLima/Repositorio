/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analisedefrequencia;

/**
 *
 * @author TI
 */
public class AnaliseFrequencia {
    
    public int analisarFrequencia(String texto){
        //System.out.print("Entrou");
        int aux, cont=0, i, j;
        char letra = 0;
        
        for(i=0; i < texto.length(); i++){          
           cont = 0;
           for(j=0; j< texto.length(); j++){
                           
               if(texto.charAt(i) == texto.charAt(j)){
                   cont++;
                   letra = texto.charAt(i);
               }
           }
           //System.out.println(texto.charAt(i) + ": " + cont);          
        }  
        
        return cont;
    }
    
    public void trocaLetra(String palavraAnalisada){
        //System.out.print("PAL: " + palavraAnalisada);
        String aux ="";
        
        for(int i=0; i < palavraAnalisada.length(); i++){
           for(int j=0; i < palavraAnalisada.length(); i++){
                if(palavraAnalisada.charAt(j) == 'r'){
                    aux = aux + palavraAnalisada.charAt(j);
                    System.out.println("AUX: " + aux);
                }else{
                    System.out.println("Deu Ruim");
                }
                
                
           }
        }
    }
}
