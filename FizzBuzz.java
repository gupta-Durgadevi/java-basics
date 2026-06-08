package pattern;
import java.util.*;



public class FizzBuzz {

	public static List <String>fizzbuzz(int n) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(i%15==0)
				result.add("Fizbuzz");
			
			else if(i%3==0)
				
				result.add("Fizz");
			else if(i%5==0)
				result.add("Buzz");
			else
				result.add(String.valueOf(i));
			  
		}
		return result; 
		

	}

}
