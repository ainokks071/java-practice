package theme1_LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest4 {

	public static void main(String[] args) {
		
		//Supplier : get()
		Supplier<Integer> s = () -> (int)(Math.random()*100 + 1);
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s, list);
		System.out.println(list);
		
		//Consumer : accept(T, t)
		Consumer<Integer> c = (i) -> System.out.print(i);
		c.accept(5234234);
		
		
		
		//Predicate : test(i)
		Predicate<Integer> p = (i) -> i % 2 == 0;
		List<Integer> evenList = extracted(list, p);
		System.out.println(evenList);
		
		//Function : apply(i)
		Function<Integer, Integer> f = (i) -> i/10*10;
		List<Integer> newList = exList(list, f);
		System.out.println(newList);
	}
	
	static List<Integer> exList(List<Integer> list, Function<Integer, Integer> f) {
		List<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			newList.add(f.apply(list.get(i)));
		}
		return newList;
	}

	static List<Integer> extracted(List<Integer> list, Predicate<Integer> p) {
		List<Integer> evenList = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			if(p.test(list.get(i))) {
				evenList.add(list.get(i));
			}
		}
		return evenList;
	}
	
	static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
		for(int i = 0; i < 10; i++) {
			list.add(s.get());
		}
	}
}