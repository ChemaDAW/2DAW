/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.*;

//CHEMA FERNANDEZ
public class Esfera {
    private Punto verticeA;
    private Punto verticeB;
    private float radio;
    static private int contador;

    public Esfera() {
        contador++;
        this.radio = 0;
    }

    public Esfera(Punto verticeA, Punto verticeB) {
          contador++;
        this.verticeA = verticeA;
        this.verticeB = verticeB;
    }

    public Esfera(Punto verticeA, Punto verticeB, float radio) {
          contador++;
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.radio = radio;
    }

    public double Perimetro() {
        double numPerimetro = 0;
        numPerimetro = 2 * Math.PI * this.radio;
        return numPerimetro;
    }

    public double Area() {
        double numArea = 0;
        numArea = this.radio * this.radio;
        numArea = numArea * 4 * Math.PI;
        return numArea;
    }

    public double CalcularD(ArrayList CalcularEsferasD) {
        double primerX;
        double primerY;
        return 4;

    }

    @Override
    public String toString() {
        return "Vertice A:\t" + this.verticeA + "\nVertice B:\t" + this.verticeB + "\nRadio:\t" + this.radio + "\n\n";
    }

    public Punto getVerticeA() {
        return verticeA;
    }

    public void setVerticeA(Punto verticeA) {
        this.verticeA = verticeA;
    }

    public Punto getVerticeB() {
        return verticeB;
    }

    public void setVerticeB(Punto verticeB) {
        this.verticeB = verticeB;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    static public void totalEsferas(){
        System.out.println("Total de esferas: "+contador);
    }

}
