/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author jrozou
 */
public class ProductoVenta extends Producto{
    private double precio;
    private int codigoVenta;

    public ProductoVenta(double precio, int codigoVenta, String nombre) {
        super(nombre);
        this.precio = precio;
        this.codigoVenta = codigoVenta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
     
    
}
