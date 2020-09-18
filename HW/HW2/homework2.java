import java.util.*;

public class homework2{
	public static void main(String[] args) {
		//1. Create an array/collection of numbers (initialize it with any number of numbers (more than 1) in numerical order, with or without duplicates)
      //2. Create a loop that loops over each number and shows their value.
      //3. Have the loop output only even numbers regardless of how long the array/collection is.
      //4. Briefly explain how you achieved the correct output.
      //5. Add screenshot of the output
      //6. upload the code/file to github and submit the github link
      
      int[] numbers = new int[5];
  
      for(int x=0; x < numbers.length; x++){
         numbers[x]=(int)(Math.random()*10);
         System.out.println(numbers[x]);
      }
      
      Arrays.sort(numbers); 
      

      for(int i=0; i < numbers.length;i++){
         if((numbers[i] % 2) == 0){
            System.out.println(numbers[i]);
         }
      }       
	}
}