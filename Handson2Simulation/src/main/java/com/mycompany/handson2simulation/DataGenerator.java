/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handson2simulation;

import java.util.Random;

/**
 *
 * @author gisse
 */

public class DataGenerator {
    /**
     * Genera un DataSet con puntos dispersos alrededor de una linea recta.
     */
    public static DataSet generateLinearDataSet(int n, double beta0, double beta1, double margenError) {
        double[] x = new double[n];
        double[] y = new double[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            // Valor aleatorio de X entre 1.0 y 10.0
            double xVal = 1.0 + (10.0 - 1.0) * random.nextDouble();
            xVal = Math.round(xVal * 10.0) / 10.0;

            // Ruido aleatorio entre -margenError y +margenError
            double ruido = (random.nextDouble() * 2 * margenError) - margenError;

            // Y cercano a la linea recta
            double yVal = beta0 + (beta1 * xVal) + ruido;
            yVal = Math.round(yVal * 10.0) / 10.0;

            x[i] = xVal;
            y[i] = yVal;
        }

        return new DataSet(x, y);
    }
}
