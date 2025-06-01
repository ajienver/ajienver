

package com.mycompany.maxminvalue;

import java.util.Scanner;

/**
 *
 * @author tiko
 */
public class MaxMinValue {

    public static void main(String[] args) {
       
       
       Scanner in = new Scanner(System.in);
     
       System.out.print("Enter the first value: ");
       int first = in.nextInt();
       System.out.print("Enter the second value: ");
       int second = in.nextInt();
       System.out.print("Enter the third value: ");
       int third = in.nextInt();
       System.out.print("Enter the fourth value: ");
       int fourth = in.nextInt();
       
       int max = Math.max(first, Math.max(second, third)); 
       int min = Math.min(second, Math.min(third, fourth));
       System.out.println("The values entered: " + first+", " + second+", " + third+", " + fourth+" " + "have a minimum value "+ min + " and maximum value "+ max);      
       
       }
      }
    

