/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
		int num1=0,num2=1,sum;
		int count;
		
		System.out.print("Input: ");
		int N = input.nextInt();
		System.out.print("Output: " + N  );
		
		
		

		for (count = 1;count<= N; count++) { 
		sum=num1+num2; 
		num1=num2; 
		num2=sum; 
		System.out.print(" "+num1); 
		} 
		} 
    }
    

