
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
public class taskSheet {
	//1. write a logic to print numbers from 1 to 50 
//	public class taskSheet {
//			public static void main() {
//				for(int  i=1;i<51;i++) {
//					System.out.println(i);
//				}
//			}
//	}
	
	
	
//2. write a logic to print only the unique data(i.e., remove duplicates )
//  List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");

	
		public static void main() {
			List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
			
			Set<String> set= new HashSet<String>();
			for(int i=0;i<names.size();i++) {
				set.add(names.get(i));
			}
			for(String name : set) {
				System.out.println(name);
			}
		}
}
	
	
	
//	public class taskSheet {
//		public static void main() {
//			List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
//			
//			
//			
//		}
//}
 
