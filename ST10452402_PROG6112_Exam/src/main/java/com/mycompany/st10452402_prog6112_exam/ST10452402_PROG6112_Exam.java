/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class ST10452402_PROG6112_Exam {

    public static void main(String[] args) {

        String[] years = {"Year 1", "Year 2"};
        String[] quarters = {"Quarter 1", "Quarter 2", "Quarter 3"};

        
        int[][] productSales = {
            {300, 150, 700}, 
            {250, 200, 600}  
        };

        
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------------------------");

        
        System.out.print("\t\t");
        for (String q : quarters) {
            System.out.print(q + "\t");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < years.length; i++) {
            System.out.print(years[i] + "\t");
            for (int j = 0; j < quarters.length; j++) {
                System.out.print("\t\t" + productSales[i][j]);
            }
            System.out.println();
        }

      
        ProductSales ps = new ProductSales();

        int total = ps.TotalSales(productSales);
        double average = ps.AverageSales(productSales);
        int max = ps.MaxSale(productSales);
        int min = ps.MinSale(productSales);

       
        System.out.println("\nPRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------------------------");
        System.out.println("Total Sales   : " + total);
        System.out.println("Average Sales : " + Math.round(average));
        System.out.println("Maximum Sale  : " + max);
        System.out.println("Minimum Sale  : " + min);
        System.out.println("--------------------------------------------------");
    }
}