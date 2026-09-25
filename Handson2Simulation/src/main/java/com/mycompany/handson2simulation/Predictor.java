/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handson2simulation;

/**
 *
 * @author gisse
 */
public class Predictor {
    private ModelParameters parameters;

    public Predictor(ModelParameters parameters) {
        this.parameters = parameters;
    }

    public double predict(double xValue) {
        return parameters.getBeta0() + parameters.getBeta1() * xValue;
    }

    public void simulatePredictionsDetailed(double[] testValues) {
        System.out.println("======================================================================");
        System.out.println("                SIMULACION Y DESGLOSE DE PREDICCIONES                 ");
        System.out.println("======================================================================");
        System.out.printf("%-10s | %-25s | %-15s\n", "Valor X", "Sustitucion: y^ = b0 + (b1 * X)", "Resultado y^");
        System.out.println("----------------------------------------------------------------------");

        double b0 = parameters.getBeta0();
        double b1 = parameters.getBeta1();

        for (double xVal : testValues) {
            double yPred = predict(xVal);
            String sustitucion = String.format("%.0f + (%.0f * %.1f)", b0, b1, xVal);
            System.out.printf("%-10.1f | %-25s | %-15.1f\n", xVal, sustitucion, yPred);
        }
        System.out.println("======================================================================\n");
    }
}
