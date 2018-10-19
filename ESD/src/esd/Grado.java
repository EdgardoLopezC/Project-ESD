/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esd;

/**
 *
 * @author lp
 */
public class Grado {
    private int id;
    private String nombre;
    private int nivel;
    private Salon salon;

    public Grado(int id, String nombre, int nivel, Salon salon) {
        setId(id);
        setNivel(nivel);
        setNombre(nombre);
        setSalon(salon);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }
    
    
    
}
