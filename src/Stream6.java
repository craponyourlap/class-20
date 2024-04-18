import java.util.Arrays;

public class Stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(new int[] {1,2,3})
		.map(n -> 2 * n + 1)
		.average()
		.ifPresent(System.out::println); //5.0
	}

}
