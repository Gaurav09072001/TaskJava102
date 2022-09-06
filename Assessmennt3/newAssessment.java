import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;

public class newAssessment{
	public static void main(String[]  Args) {
    List<Integer> numberList= Arrays.asList(1,2,3,4,5,1,4,2); 
		
		//count number of elements
		long count=numberList.stream().count();
		System.out.println("Total Number of elements :- "+ count);
		
		
		//Print 1st Element
		Optional<Integer> firstElementOptional =numberList.stream().findFirst();
		System.out.println(" 1St elements is:- "+ firstElementOptional);
		
		//Print to Uppercase
		List<String> names = Arrays.asList("aa", "bb", "aa", "dd","aa");
		names.stream().map(name-> name.toUpperCase()).forEach(System.out::println);
	
		System.out.println();
		//use 2 intermediate operation in a Single Stream
		names.stream().map(name-> name.toUpperCase()).skip(1).distinct().forEach(System.out::println);
		
		
		List<String> foodStream= Arrays.asList("HotDog","Pasta","Burger","Pizza","Patties","Noodles");
		//AnyMatch
		boolean answer = foodStream.stream().anyMatch(name-> Character.isUpperCase(name.charAt(0)));
		System.out.println("AnyMatch :- "+answer);
		
		//ALLMATCH
		boolean answer1 = foodStream.stream().allMatch(name-> Character.isUpperCase(name.charAt(0)));
		System.out.println("allMatch :- "+answer1);
		
		//NONEMATCH
		boolean answer2= foodStream.stream().noneMatch(name-> Character.isUpperCase(name.charAt(0)));
		System.out.println("noneMatch :- "+answer2);
		
		HashMap<Integer,String> foodMap= new HashMap<>();
		
		foodMap.put(1, "HotDog");
		foodMap.putIfAbsent(1, "Pasta");
		foodMap.put(3, "Pizza");
		foodMap.put(4, "Patties");
		foodMap.put(5, "Noodles");
	}
}
