/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.handson2simulation;

/**
 *
 * @author gisse
 */
public class Handson2Simulation {

    public static void main(String[] args) {
        // 1. Generar los datos aleatorios mediante DataGenerator
        DataSet dataSet = DataGenerator.generateLinearDataSet(5, 1.0, 2.0, 0.8);
        
        // Imprimir los datos generados en consola
        dataSet.printDataSet();

        // 2. Ajustar el modelo SLR
        ModelParameters params = SLRSolver.fit(dataSet);
        params.printDetailedReport();

        // 3. Simular predicciones
        Predictor predictor = new Predictor(params);
        double[] testValues = {6.0, 7.0, 8.0, 9.0, 10.0};
        predictor.simulatePredictionsDetailed(testValues);
    }
}
