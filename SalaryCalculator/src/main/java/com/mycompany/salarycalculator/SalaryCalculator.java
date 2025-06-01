/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarycalculator;

import java.util.Scanner;

/**
 *
 * @author tiko
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("For how many days will the pay double? : ");
        
        int days = scanner.nextInt();
        
        double totalPay = 0;
        System.out.println("Day\t\tTotal Pay");
        System.out.println("------------------------------------");
        for (int day = 1; day <= days; day++) {
        if (days < 1 || days > 45){
        System.out.println("Error! Please enter a number from 1 to 45.");
        break;
        }
        double everydayPay = Math.pow(2, day - 1) / 100;

        System.out.println(day + "\t\t"+ String.format("$\t%10.2f", everydayPay));
        totalPay += everydayPay;
        }
        System.out.println("------------------------------------");
        System.out.println("Total:\t\t"+ String.format("$\t%10.2f", totalPay));
        
    }
}