/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motordatabase.cr.ac.itcr.Main;
import  motordatabase.cr.ac.itcr.Datos.beans;
        
       
/**
 *
 * @author jonathan-garcia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        beans ee= new beans() ;
        ee.setApellido("GARCIA\n");
        ee.setId(1 );
        
        ee.setNombre("Jonathan \n");
        System.out.print(ee.getNombre());
        
        System.out.print(ee.getApellido());
        
        System.out.print(ee.getId());
        // TODO code application logic here
   
    }
    
}
