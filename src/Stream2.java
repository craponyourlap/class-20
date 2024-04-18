import java.util.Arrays;
import java.util.List;

public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
		boolean allEven = intList.stream().allMatch(t -> t % 2 == 0);
		boolean oneEven = intList.stream().anyMatch(t -> t % 2 == 0);
		boolean noneMultipleOfThree = intList.stream().noneMatch(t -> t % 3 == 0);
		System.out.println(allEven);
		System.out.println(oneEven);
		System.out.println(noneMultipleOfThree);
//		false
//		true
//		false
	}

}
