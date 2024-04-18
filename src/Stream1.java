import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] numbers = {2.4, 55.6, 90.12, 26.6};
		Set<Double> set = new HashSet<>(Arrays.asList(numbers));
		int count = 0;
//		for (double e : set)if (e > 60) count++;
//		System.out.println("count is " + count);
//		this is what you would usually do, which could be replaced by a stream method
		System.out.println("count is " + set.stream().filter(d -> d > 60).count());
//		this is a more efficient way to do it
		
//		streams are lazy, that is to say that it calculation starts when the .count(), the terminal
//		operation, is called. this allows jvm to optimize computation
		
		
	}

}
