/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handson2simulation;

/**
 *
 * @author gisse
 */
public class ModelParameters {
    private double beta0;
    private double beta1;

    public ModelParameters(double beta0, double beta1) {
        this.beta0 = beta0;
        this.beta1 = beta1;
    }

    public double getBeta0() { return beta0; }
    public double getBeta1() { return beta1; }

    public void printDetailedReport() {
        System.out.println("========================================");
        System.out.println("      PARAMETROS CALCULADOS DEL MODELO   ");
        System.out.println("========================================");
        System.out.printf(" Beta 0 (Interseccion): %.2f\n", beta0);
        System.out.printf(" Beta 1 (Pendiente)   : %.2f\n", beta1);
        System.out.println("----------------------------------------");
        System.out.printf(" Ecuacion Modelo     : y^ = %.0f + %.0fx_1\n", beta0, beta1);
        System.out.println("========================================\n");
    }

}
