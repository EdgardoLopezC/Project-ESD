/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tadoemplate in the editor.
 */
package esd;

import java.util.ArrayList;

/**
 *
 * @author lp
 */
public class Clase {
    private Materia materia;
    private ArrayList<Grado> grados;

    public Clase(Materia materia) {
        setMateria(materia);
        grados = new ArrayList<Grado>();
    }

    public Clase(Materia materia, ArrayList<Grado> grados) {
        setMateria(materia);
        setGrados(grados);
    }
    

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public ArrayList<Grado> getGrados() {
        return grados;
    }

    public void setGrados(ArrayList<Grado> grados) {
        this.grados = grados;
    }
    
    public void agregarGrado(Grado grado){
        getGrados().add(grado);
    }
    
    public void eliminarGrado(Grado grado){
        getGrados().remove(grado);
    }
    
    
}
