import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task {
	
	public static void main(String[] args) {
		List<String> sampleDataList = Arrays.asList("bombay","Mumbai" ,"", "Belgium", "NewDelhi" , "Mumbai","chicago","chile","chennai","bombay");
		
		//count cites name starting with c
		long output= sampleDataList.stream().filter(name->name.startsWith("c") ).count();
		System.out.println(output);
		
		
		//printing the cities with forEach 
		sampleDataList.stream().filter(name->name.startsWith("c") ).forEach(x-> System.out.println(x));
		
		//Distinct cities
		
		List<String> getDistinctData = sampleDataList.stream().filter(name-> name!="").distinct().collect(Collectors.toList()); 
		System.out.println(getDistinctData);
		
		//count empty  string
		Long countEmptyString = sampleDataList.stream().filter(name-> name=="" ).count(); 
		System.out.println(countEmptyString);
		
		//sum of number
		
		int sum=IntStream.range(1, 26).sum();
		System.out.println(sum);
		
		
	}
	
}
