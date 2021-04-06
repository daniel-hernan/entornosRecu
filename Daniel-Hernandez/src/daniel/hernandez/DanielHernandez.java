/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.hernandez;

/**
 *
 * @author admin
 */
public class DanielHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "pepe";
        Comercial comerciales[] = new Comercial[10];
        comerciales[1] = new Comercial(nombre, 300);

        comerciales[1].toString();
    }

}
