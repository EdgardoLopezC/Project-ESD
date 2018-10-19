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
public class Nota {
    private double nota1;
    private double nota2;
    private double nota3;
    private String estado;
    private Materia materia;

    public Nota(double nota1, double nota2, double nota3, String estado, Materia materia) {
        setEstado(estado);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setMateria(materia);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
