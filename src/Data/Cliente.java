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
public class Cliente {
    private String nombre;
    private int cedula;
    private ArrayList<ProductoCompra> productosCompra;

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.productosCompra = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList<ProductoCompra> getProductosCompra() {
        return productosCompra;
    }

    public void setProductosCompra(ArrayList<ProductoCompra> productosCompra) {
        this.productosCompra = productosCompra;
    }
    
    public boolean addProductosCompra(ProductoCompra p){
        return this.productosCompra.add(p);
    }
    
    public boolean removeProductosCompra(ProductoCompra p){
        return this.productosCompra.remove(p);
    }
}
