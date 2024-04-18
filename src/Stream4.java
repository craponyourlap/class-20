import java.util.Arrays;
import java.util.List;

public class Stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList
		.stream()
		.filter(t -> t.startsWith("c"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
	}

}
