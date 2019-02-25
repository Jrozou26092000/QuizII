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
public class ProductoCultivo extends Producto{
    private Farmer farmer;

    public ProductoCultivo(Farmer farmer, String nombre) {
        super(nombre);
        this.farmer = farmer;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
}
