/*
 * File Name: FibaNumbers
 * Author:    Abdiwali M Olad
 * Due Date:  10.08.2018
 */
public class FibaNumbers { // class starts here

	public static void main(String[] args) {//Method starts here
		
		// Declare  two variables 
		
		int fib1 = 0; // first variable fib1 in 
		int fib2= 1;
		
		// for loops fibonacci 
		for ( int i = 2; i<= 12; i++) {
			System.out.println(fib1); //print first fib1
			int newFib = fib1 + fib2; //initiate newfib and add fib1 and fib2
			fib1 = fib2; // Now fib1 become fib2
			fib2 = newFib; // and fib2 become newfib
		}//End of the For loop

	}//End of main

}//End of Class
