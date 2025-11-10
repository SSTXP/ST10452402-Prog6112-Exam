/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public interface IProductSales {
  
    int[][] GetProductSales();
    int GetTotalSales();
    int GetSalesOverLimit();
    int GetSalesUnderLimit();
    int GetProductsProcessed();
    double GetAverageSales();
}