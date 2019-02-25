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
public class Fecha {
    private int dia;
    private int mes;
    private int annio;
    private Eslabones eslabon;

    public Fecha(int dia, int mes, int annio, Eslabones eslabon) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
        this.eslabon = eslabon;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Eslabones getEslabon() {
        return eslabon;
    }

    public void setEslabon(Eslabones eslabon) {
        this.eslabon = eslabon;
    }
    
    
          
}
