/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarcronometro;

/**
 *
 * @author carlosjoseanguiano
 */
public class ProbarCronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c;
        
        Cronometro cronometro = new Cronometro();
        
        for (a = 0; a < 10000; a++) {
            for (b =0; b < 10000; b++) {
                
                c = a+b;
            }
        }
        
        System.out.println("Time is : " + cronometro.tiempoPasado());
    }
    
}
