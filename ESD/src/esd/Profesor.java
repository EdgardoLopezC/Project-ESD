/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esd;

import java.util.ArrayList;

/**
 *
 * @author lp
 */
public class Profesor {
    private int dui;
    private  int nit;
    private Usuario usuario;
    private Clase claseEncargada;
    private ArrayList<Clase> clases;

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Clase getClaseEncargada() {
        return claseEncargada;
    }

    public void setClaseEncargada(Clase claseEncargada) {
        this.claseEncargada = claseEncargada;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    
    public void agregarClases(Clase clase){
        getClases().add(clase);
    }
    
    public void eliminarClases(Clase clase){
        getClases().remove(clase);
    }
    
}
