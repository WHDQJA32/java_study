package study.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자들을 set 사용하고 싶으면?
		//Wrapper Class
		// int -> Integer
		// double -> Double
		
		// String 은 참조타입변수라서 그래도 쓸수 있다.
		
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		System.out.println(set1.size());
		//중복값은 포함하지않는다.
		set1.add("C");
		set1.add("C");
		set1.add("C");
		set1.add("C");
		set1.add("E");
		
		set1.add("F");
		set1.add("H");
		set1.add("A");
		
		System.out.println(set1.size());
		
		Iterator<String> i1 = set1.iterator();
		
//		i1.hasnext() 다음 값이 존재하는지 확인
//		i1.next() 다음 값 읽어오기
		while(i1.hasNext()) {
			String n = i1.next();
			System.out.println(n);
		}
	}

}