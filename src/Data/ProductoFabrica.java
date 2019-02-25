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
public class ProductoFabrica extends Producto{
    private String numLote;
    private ArrayList<ProductoCultivo> materiaPrima;
    private DistributionCenter centroDistribucion ;

    public ProductoFabrica(String numLote,
            DistributionCenter centroDistribucion, String nombre) {
        super(nombre);
        this.numLote = numLote;
        this.materiaPrima = new ArrayList<>();
        this.centroDistribucion = centroDistribucion;
    }

    public ArrayList<ProductoCultivo> getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(ArrayList<ProductoCultivo> materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public DistributionCenter getCentroDistribucion() {
        return centroDistribucion;
    }

    public void setCentroDistribucion(DistributionCenter centroDistribucion) {
        this.centroDistribucion = centroDistribucion;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    public ArrayList<ProductoCultivo> getProductosCultivo() {
        return materiaPrima;
    }

    public void setProductosCultivo(ArrayList<ProductoCultivo> materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
    
     public boolean addProductosCultivo(String nombre,Farmer f){
        return this.materiaPrima.add(new ProductoCultivo(f,nombre));
    }
    
    public boolean removeProductosCultivo(ProductoCultivo p){
        return this.materiaPrima.remove(p);
    }
}
