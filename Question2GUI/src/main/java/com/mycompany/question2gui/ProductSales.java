/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2gui;

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

    private final int[][] productSales = {
        {300, 150, 700}, 
        {250, 200, 600}  
    };

    private final int salesLimit = 500;

    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    @Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        int count = productSales.length * productSales[0].length;
        return (double) total / count;
    }

    @Override
    public int GetSalesOverLimit() {
        int overLimit = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > salesLimit) {
                    overLimit++;
                }
            }
        }
        return overLimit;
    }

    @Override
    public int GetSalesUnderLimit() {
        int underLimit = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < salesLimit) {
                    underLimit++;
                }
            }
        }
        return underLimit;
    }

    @Override
    public int GetProductsProcessed() {
        return productSales.length;
    }

    public String GetSalesReport() {
        int total = GetTotalSales();
        double average = GetAverageSales();
        int overLimit = GetSalesOverLimit();
        int underLimit = GetSalesUnderLimit();


        String report = "Total Sales: " + total + "\n"
                      + "Average Sales: " + Math.round(average) + "\n"
                      + "Sales Over Limit: " + overLimit + "\n"
                      + "Sales Under Limit: " + underLimit + "\n";

        return report;
    }
}