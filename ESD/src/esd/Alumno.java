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
public class Alumno {
    private Usuario usuario;
    private BoletaDeNota boletaDeNota;
    private ArrayList<Clase>clases;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BoletaDeNota getBoletaDeNota() {
        return boletaDeNota;
    }

    public void setBoletaDeNota(BoletaDeNota boletaDeNota) {
        this.boletaDeNota = boletaDeNota;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    
    public void agregarClase(Clase clase){
        getClases().add(clase);
    }
    
    public void EliminarClase(Clase clase){
        getClases().remove(clase);
    }
    
}
