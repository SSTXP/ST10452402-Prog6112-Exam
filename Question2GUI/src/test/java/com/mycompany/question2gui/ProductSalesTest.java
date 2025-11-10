/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question2gui;

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
public class ProductSalesTest {

    ProductSales ps = new ProductSales();

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        int expected = 2;
        int actual = ps.GetSalesOverLimit();
        assertEquals(expected, actual);
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        int expected = 4;
        int actual = ps.GetSalesUnderLimit();
        assertEquals(expected, actual);
    }
}