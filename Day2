package java102;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Function;
public class Sept_2nd {
	public static  void main(String args[]) {
		
		//Consumer 
		
		Consumer<Integer> nums = (number) -> System.out.println(number*10);
		nums.accept(10);
		
		Consumer<String> consumer  = (name) -> System.out.println(name.toUpperCase());
		consumer.accept("Hello");
		
		Consumer<String> consumerDemo  = (name) -> System.out.println(name.length());
		
		consumer.andThen(consumerDemo).accept("team");
		
		Consumer<Integer> consumerInteger  = (mark) -> System.out.println(mark+10);
		consumerInteger.accept(20);
		
		
		
		//BiConsumer
		BiConsumer<Integer,Integer> bic1= (x,y) -> System.out.println(x+y);
		bic1.accept(10, 20);
		
		BiConsumer<Integer,Integer> bic2= (x,y) -> System.out.println(x*y);
		bic2.accept(10, 20);
		
		BiConsumer<String,String> StringBiC= (x,y) -> System.out.println(x+y);
		StringBiC.accept("Gaurav"," Sharma");
		
		bic1.andThen(bic2).accept(10, 20);
		
		System.out.println();
		
		//Predicate
		Predicate<Integer> greaterThanPredicate = (mark) -> mark>50;
		System.out.println("Integer Preedicate "+greaterThanPredicate.test(100));
		
		Predicate<Integer> lessThanPredicate = (mark) -> mark<50;
		System.out.println("Integer Preedicate "+greaterThanPredicate.test(100));
		
		Predicate<String> lengthGreaterThan3 = (str) ->  str.length()>3;
		System.out.println("String Predicate "+lengthGreaterThan3.test("Hello"));
		
		System.out.println("And for predicate = "+greaterThanPredicate.and(lessThanPredicate).test(100));
		
		
		System.out.println("Or for predicate = "+greaterThanPredicate.or(lessThanPredicate).test(100));
		
		
		//BiPredicate
		System.out.println();
		BiPredicate<Integer,Integer> greaterThanBiPredicate = (marks_1,marks_2) -> marks_1>marks_2; 
		System.out.println("Integer BiPreedicate "+greaterThanBiPredicate.test(100, 200));
		
		BiPredicate<Integer,Integer> lessThanBiPredicate = (marks_1,marks_2) -> marks_1<marks_2; 
		System.out.println("Integer BiPreedicate "+lessThanBiPredicate.test(100, 200));
		
		
		System.out.println("And for BiPredicate = "+greaterThanBiPredicate.and(lessThanBiPredicate).test(150,75));
		
		
		System.out.println("Bi for BiPredicate = "+greaterThanBiPredicate.or(lessThanBiPredicate).test(150,75));
		
		
	}
	
}
