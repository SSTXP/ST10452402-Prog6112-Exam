/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10452402_prog6112_exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
public class ST10452402_PROG6112_ExamTest {
    
   ProductSales ps = new ProductSales();

    int[][] testSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int expected = 2200;
        int actual = ps.TotalSales(testSales);
        assertEquals(expected, actual);
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        double expected = 2200.0 / 6.0;
        double actual = ps.AverageSales(testSales);
        assertEquals(expected, actual, 0.01);
    }
    
}