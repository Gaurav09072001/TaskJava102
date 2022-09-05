import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Assessment2 {
	
	public static void main(String[] args) {
    //List of square of all distinct  number
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> squareNum = numbers.stream().distinct().map(x-> x*x).collect(Collectors.toList());
		System.out.println("Square of List numbers :- "+squareNum);
		
		//All even number in the string
		
		List<Integer> evenNumberInString = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("Even numbers in list :- "+evenNumberInString);
		
		//Total number of elements in the  list
		
		Long totalNumberElementsInList = numbers.stream().count();
		System.out.println("total number of elements in list :- "+ totalNumberElementsInList);

		
		
	}
	
}
