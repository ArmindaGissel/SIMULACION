/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handson2simulation;

/**
 *
 * @author gisse
 */
public class SLRSolver {
    public static ModelParameters fit(DataSet dataSet) {
        int n = dataSet.size();
        double sumX = DiscreteMaths.sum(dataSet.getX());
        double sumY = DiscreteMaths.sum(dataSet.getY());
        double sumX2 = DiscreteMaths.sumXSquared(dataSet.getX());
        double sumXY = DiscreteMaths.sumXY(dataSet.getX(), dataSet.getY());

        double beta1 = (n * sumXY - sumX * sumY) / (n * sumX2 - (sumX * sumX));
        double beta0 = (sumY - beta1 * sumX) / n;

        return new ModelParameters(beta0, beta1);
    }
}
