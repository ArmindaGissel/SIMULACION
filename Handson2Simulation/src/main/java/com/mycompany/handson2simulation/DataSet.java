/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handson2simulation;

/**
 *
 * @author gisse
 */
public class DataSet {
    private double[] x;
    private double[] y;

    // Constructor estándar que recibe los arreglos generados
    public DataSet(double[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public double[] getX() { return x; }
    public double[] getY() { return y; }
    public int size() { return x.length; }

    // Método para imprimir en la terminal los puntos generados por DataGenerator
    public void printDataSet() {
        System.out.println("========================================");
        System.out.println("   PUNTOS ALEATORIOS GENERADOS (X, Y)   ");
        System.out.println("========================================");
        System.out.printf("%-15s | %-15s\n", "X (Aleatorio)", "Y (Cercano a recta)");
        System.out.println("----------------------------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-15.1f | %-15.1f\n", x[i], y[i]);
        }
        System.out.println("========================================\n");
    }
}
