/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motordatabase.cr.ac.itcr.Main;
import  motordatabase.cr.ac.itcr.Datos.ejemploDatos;
        
       
/**
 *
 * @author jonathan-garcia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ejemploDatos e= new ejemploDatos();
        System.out.print(e.nombre());
        
        // TODO code application logic here
    }
    
}
