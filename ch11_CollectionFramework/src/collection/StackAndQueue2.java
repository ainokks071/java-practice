package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue2 {

	public static void main(String[] args) {
		//Stack, Queue 

		Stack st = new Stack();
		st.push("0");
		st.push("1");
		st.push("2");

		System.out.println("Stack");
		
//		for(int i = st.size()-1; i >= 0; i--) { 얘도 가능하긴 하지.
		while(!st.empty()) {
		System.out.println(st.pop());
		}
		
		Queue q = new LinkedList();
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("Queue");
		while(!q.isEmpty()) {
		System.out.println(q.poll());
		}
		
	}
}
