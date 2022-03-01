/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.modelo_grafica;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class GraficaBarras {
    
    public ArrayList<Double> ejeY;
    public ArrayList<String> ejeX;
    public String titulo;
    public ArrayList<String> uniones;

    public GraficaBarras(String titulo, ArrayList<String> ejeX, ArrayList<Double> ejeY, ArrayList<String> uniones) {
        this.ejeY = ejeY;
        this.ejeX = ejeX;
        this.titulo = titulo;
        this.uniones = uniones;
    }

    public ArrayList<Double> getEjeY() {
        return ejeY;
    }

    public void setEjeY(ArrayList<Double> ejeY) {
        this.ejeY = ejeY;
    }

    public ArrayList<String> getEjeX() {
        return ejeX;
    }

    public void setEjeX(ArrayList<String> ejeX) {
        this.ejeX = ejeX;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getUniones() {
        return uniones;
    }

    public void setUniones(ArrayList<String> uniones) {
        this.uniones = uniones;
    }
}
