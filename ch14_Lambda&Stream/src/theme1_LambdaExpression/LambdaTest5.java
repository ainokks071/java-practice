package theme1_LambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaTest5 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i ++) {
			list.add(i);
		}
		
		list.forEach((i)->System.out.print(i + " ")); //Consumer의 accept를 구현 
		
//	    void forEach(Consumer<Integer> con) {
//	        for (int i : this) {
//	            con.accept(i);
//	        }
//	    }

		System.out.println();
		
		list.removeIf((i)->i%2==0); // i -> i % 2 == 0 : Predicate의 test를 구현
		
//	    boolean removeIf(Predicate<Integer> pre) {
//	        boolean removed = false;
//	        Iterator<E> each = iterator();
//	        while (each.hasNext()) {
//	            if (pre.test(each.next())) {
//	                each.remove();
//	                removed = true;
//	            }
//	        }
//	        return removed;
//	    }
		System.out.println(list);
		
		list.replaceAll((i)->i*100); // i -> i * 100 : Function의 apply를 구현
//	    void replaceAll(UnaryOperator<E> operator) {
//	        ListIterator<E> li = this.listIterator();
//	        while (li.hasNext()) {
//	            li.set(operator.apply(li.next()));
//	        }
//	    }
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k, v) -> System.out.println(k + " : " + v));
//	    default void forEach(BiConsumer<? super K, ? super V> action) {
//	        Objects.requireNonNull(action);
//	        for (Map.Entry<K, V> entry : entrySet()) {
//	            K k;
//	            V v;
//	            try {
//	                k = entry.getKey();
//	                v = entry.getValue();
//	            } catch (IllegalStateException ise) {
//	                // this usually means the entry is no longer in the map.
//	                throw new ConcurrentModificationException(ise);
//	            }
//	            action.accept(k, v);
//	        }
//	    }

		
		
		
	}
}