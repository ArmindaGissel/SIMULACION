/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handson2simulation;

/**
 *
 * @author gisse
 */
public class DiscreteMaths {
    public static double sum(double[] array) {
        double total = 0;
        for (double val : array) total += val;
        return total;
    }

    public static double sumXSquared(double[] x) {
        double total = 0;
        for (double val : x) total += val * val;
        return total;
    }

    public static double sumXY(double[] x, double[] y) {
        double total = 0;
        for (int i = 0; i < x.length; i++) total += x[i] * y[i];
        return total;
    }
}
