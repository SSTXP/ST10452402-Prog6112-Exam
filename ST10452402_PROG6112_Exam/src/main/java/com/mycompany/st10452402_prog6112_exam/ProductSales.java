/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10452402_prog6112_exam;

/**
 *
 * @author lab_services_student
 * 
 * Student Number: ST10452402    
 * Name and Surname: Sohan Seeth    
 * Module: PROG6112 
 * Module Code: Programming 1B
 * Assessment Type: Exam
 * Lecturer Name: Ms. Dharshanee Moodley
 */
public class ProductSales implements IProductSales {
      @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }
        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = productSales.length * productSales[0].length;
        return (double) total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int[] row : productSales) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int[] row : productSales) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }   
}