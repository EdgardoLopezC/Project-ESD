/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esd;

import java.util.Date;

/**
 *
 * @author lp
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected Date fNacimiento;
    protected String dui;

    public Persona(String nombre, String apellido, Date fNacimiento, String dui) {
        setApellido(apellido);
        setDui(dui);
        setNombre(nombre);
        setfNacimiento(fNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

}
