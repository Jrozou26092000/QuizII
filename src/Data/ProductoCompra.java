/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.*;

/**
 *
 * @author jrozou
 */
public class ProductoCompra extends Producto{
    private ArrayList<Fecha> fechas;

    public ProductoCompra(String nombre,ArrayList<Fecha> fechas) {
        super(nombre);
        this.fechas = fechas;
    }

    public ArrayList<Fecha> getFechas() {
        return fechas;
    }

    public void setFechas(ArrayList<Fecha> fechas) {
        this.fechas = fechas;
    }
    
    
}
