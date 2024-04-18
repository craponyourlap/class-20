import java.util.Arrays;

public class Stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList("a1", "a2", "a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::println); //a1
	}

}
