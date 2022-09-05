package java102.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Assesssmennt {
	
	static List<Person> personList= PersonRepository.getAllPersons();
	
	static BiPredicate<String,Integer> basketBallTeam = (gender,height)-> gender.equals("Male") && height>50; 
	
	static BiConsumer<Double,List<String>> salaryAndHobbies = (salary,hobbies) ->{
			System.out.print("Salaries : "+ salary + " Hobbies : ");
			for(String str : hobbies) {
				System.out.print(str.toUpperCase()+" ");
			}
			System.out.println();
	};
	static List<String> cityList   =  Arrays.asList("Alwar","Jaipur","Rajgarh","Noida","Ajmer");
	
	public static void main(String Args[]) {
		//BasketBallTeam
		personList.forEach(per->{
			if(basketBallTeam.test(per.getGender(), per.getHeight())) {
				System.out.println(per.getName()+" "+per.getGender()+" "+ per.getHeight());
			}
		});
		//Hobbies And Salary
		personList.forEach(per->{
			salaryAndHobbies.accept(per.getSalary(),per.getHobbies());
		});
		
		//Sorted Cities
		
		List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
		System.out.println("Before Sort : " + cityList);
		System.out.println("After Sort : " + sortedList);
		
	}
}
