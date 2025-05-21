package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) {
		
		List<Person> pList = new ArrayList<>();
		
		Person p1 = new Person("유재석","010-1111-1111","02-1111-1111");
				
		Person p2 = new Person("이효리","010-2222-2222","02-2222-2222");
		
		Person p3 = new Person("박명수","010-3333-3333","02-3333-3333");
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		for(Person p : pList ) {
			p.showInfo();
			
		}
		
		
	}

}
