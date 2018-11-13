/*Title:   Assignment6
  * Author: Abdiwali Olad
  * Date:   11/12/2018
  */


import java.util.Arrays; // import java array util
public class ArrayRealNumbers {

	public static void main(String[] args) {
	
		double [] list1 = {16.1,12.3,22.2,14.4}; //  creating two lists of array decimal number
		double [] list2 = {1.5,4.3,7.0,19.5,25.1,46.2};
		
		
		//create boolean(true or false) and called the first list1 in result
		boolean result = isSorted(list1);
		System.out.println(result); //print out the result
		
		//create boolean(true or false) and  called the second list2 in result 
		boolean result2 = isSorted(list2);
		System.out.println(result2);
		
		

	}
	 // create boolen method that hold one parameter and search for if is sort if not return false
	public static boolean isSorted(double[] list){
		if (list.length==1) 
			return true;
		else
		{
			for( int i = 0; i <list.length-1; i++){
				if(list[i] >list[i+1]){
					return false;
				}
			}
			
		}
		
		return true; // return true after you search a
		
	}
	
}

