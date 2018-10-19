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
public class BoletaDeNota {
    private int ID;
    private ArrayList<Nota> notas;
    private Profesor profesorEncargado;

    public BoletaDeNota(int ID, ArrayList<Nota> notas, Profesor profesorEncargado) {
        setID(ID);
        setNotas(notas);
        setProfesorEncargado(profesorEncargado);
    }

    public BoletaDeNota(int ID, Profesor profesorEncargado) {
        setID(ID);
        notas = new ArrayList<Nota>();
        getProfesorEncargado();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    public void agregarNota(Nota nota){
        getNotas().add(nota);
    }
    
    public void EliminarNota(Nota nota){
        getNotas().remove(nota);
    }

    public Profesor getProfesorEncargado() {
        return profesorEncargado;
    }

    public void setProfesorEncargado(Profesor profesorEncargado) {
        this.profesorEncargado = profesorEncargado;
    }
}
