import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Task{
	public static void main(String[]  Args) {
  
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
		
		//FINDANY
		Optional<String> result=foodStream.stream().filter(name-> Character.isUpperCase(name.charAt(0))).findAny();
		
		//FINDFIRST
		Optional<String> result2=foodStream.stream().filter(name-> Character.isUpperCase(name.charAt(0))).findFirst();
		System.out.println("Find Any :-  "+result+"  FindFirst :- "+result2);
		
		
		//HASHMAP
		
		HashMap<Integer,String> foodMap= new HashMap<>();
		
		foodMap.put(1, "HotDog");
		foodMap.putIfAbsent(1, "Pasta");
		foodMap.put(3, "Pizza");
		foodMap.put(4, "Patties");
		foodMap.put(5, "Noodles");
		
	}
}
