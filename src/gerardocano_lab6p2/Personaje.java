/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardocano_lab6p2;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author gcano
 */
public class Personaje {
    private String nombre,poder,debilidad , universo;
    private double fuerza,hp,fisica,mental;

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String universo, double fuerza, double hp, double fisica, double mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.hp = hp;
        this.fisica = fisica;
        this.mental = mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getMental() {
        return mental;
    }

    public void setMental(double mental) {
        this.mental = mental;
    }

    @Override
    public String toString() {
               return  nombre+"\n"+
                "Poder-> "+poder+"\n"  +
                 "Hablidad Fisica-> "+fisica+"\n"+
                 "Fuerza-> "+debilidad+"\n"+
                 "Mental-> "+mental+"\n"+
                 "HP-> "+hp;
        
    }
    public String toString2(){
        return   "Poder-> "+poder+"\n"  +
                 "Hablidad Fisica-> "+fisica+"\n"+
                 "Fuerza-> "+debilidad+"\n"+
                 "Mental-> "+mental+"\n"+
                 "HP-> "+hp;   
    }
    
}
