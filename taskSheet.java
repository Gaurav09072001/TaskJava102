package java102;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class taskSheet {
//1. write a logic to print numbers from 1 to 50 
	
	public static void print_50() {
		for(int  i=1;i<51;i++) {
			System.out.println(i);
		}			
	}
//  2. write a logic to print only the unique data(i.e., remove duplicates )
	public static void removeDuplicate(List<String> names,ArrayList<String> temp) {
		HashSet<String> hash = new  HashSet<String>();
		for(int i=0;i<names.size();i++) {
			if(! hash.contains(names.get(i))) {
				hash.add(names.get(i));
				temp.add(names.get(i));
			}
		}
	}
//	3.have a list of string with some datas and try to print the count of the datas having length greater than 3 
	

public static void lengthMoreThan3(List<String> names){
		List<String> newdata = new ArrayList();
		
		for(String name : names) {
			if(name.length()>3) {
				newdata.add(name);
			}
		}
		
		for(String name : newdata) {
			System.out.print(name+" ");	  	
		}
		System.out.println();
	}
// 4. write a logic to convert all the datas in a collection to uppercase
	public static void convertUpperCase(List<String> names) {
		for(int i=0; i<names.size();i++) {
			String name = names.get(i);
			names.set(i, name.toUpperCase());
		}
		System.out.println(names);
	}
	public static void main(String[] args) {
		System.out.println("1) Print 1 to 50:");
		print_50();
		
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		ArrayList<String> temp= new ArrayList<String>() ;
		
		System.out.println("2) Remove Duplicates: ");
		removeDuplicate(names,temp);
		for(String name : temp) {
			System.out.println(name);
		}
		List<String> name = Arrays.asList("Sam", "Peter","ballon","Sam","news","Gaurav","Sharma");
		System.out.println();
		System.out.println("3) Count of data having length greater than 3:");
		lengthMoreThan3(name);
		System.out.println("4) Convert all the data to upper case: ");
		convertUpperCase(name);

	}
}

	
	
 
	
	
 
