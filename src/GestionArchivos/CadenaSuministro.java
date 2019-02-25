/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;

import Data.Eslabones;
import java.util.*;
/**
 *
 * @author jrozou
 */
public class CadenaSuministro {
    private String nombre;
    private ArrayList<Eslabones> eslabones;

    public CadenaSuministro(String nombre) {
        this.nombre = nombre;
        this.eslabones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Eslabones> getEslabones() {
        return eslabones;
    }

    public void setEslabones(ArrayList<Eslabones> eslabones) {
        this.eslabones = eslabones;
    }
    
    public boolean addEslabones(Eslabones e){
        return this.eslabones.add(e);
    }
    
    public boolean removeEslabones(Eslabones e){
        return this.eslabones.remove(e);
    }
    
}
