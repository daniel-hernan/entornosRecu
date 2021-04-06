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
public class Comercial {

    private String nombre;
    private int sueldo;
    private String fechanac;

    public Comercial(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public String getFechanac() {
        return fechanac;
    }

    @Override
    public String toString() {
        return "Comercial{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

}
