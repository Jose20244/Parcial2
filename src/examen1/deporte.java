/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;
/**
 *
 * que deporte practica 
 */
public class deporte {
    String dep,frecuencia,equipo, evento, ver;
    double edad;

    public deporte(String dep, String frecuencia, String equipo, String evento, String ver, double edad) {
        this.dep = dep;
        this.frecuencia = frecuencia;
        this.equipo = equipo;
        this.evento = evento;
        this.ver = ver;
        this.edad = edad;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
    

    public deporte() {
    }
    
   
    
    
    
}
