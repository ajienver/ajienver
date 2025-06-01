
package com.mycompany.monthlysalestax;

import java.util.Scanner;

/**
 *
 * @author : Haji Enver
 */
public class MonthlySalesTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Month: ");
        String month = scanner.next();
        int year = scanner.nextInt();
        System.out.println("-----------------------------");
        
        
        float totalCollected, sales, countySalesTax, stateSalesTax , totalSalesTax ; 
        final float stateTaxRate = .0675f, countyTaxRate = .031f, totalTaxRate = 1.0985f;
      
        System.out.printf("Total Collected: $ ");
        totalCollected = scanner.nextFloat();
        
        sales = totalCollected / totalTaxRate;
        countySalesTax = sales * countyTaxRate;
        stateSalesTax = sales * stateTaxRate;
        countySalesTax = countyTaxRate * sales;
        totalSalesTax = stateSalesTax + countySalesTax;
        
        
        
        
        
        
        System.out.printf("Sales: $ %.2f%n",sales);
        
        System.out.printf("County Sales Tax: $ %.2f%n" ,countySalesTax);

        System.out.printf("State Sales Tax: $ %.2f%n" ,stateSalesTax);        

        System.out.printf("Total Sales Tax: $ %.2f%n" ,totalSalesTax);        

        
        
       



       
    }
}
