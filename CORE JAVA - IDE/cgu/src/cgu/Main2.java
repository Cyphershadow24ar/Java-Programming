package cgu;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(20);
		
//		System.out.println("List is : " + list);
//		System.out.println("Size: " + list.size());
//		System.out.println("List is empty: " + list.isEmpty());
//
//		list.add(2, 50); // to add. 
//		System.out.println("List is: " + list);
//
//		list.set(1, 25); // to replace at a position.
//		System.out.println("List is: " + list);
//
//		list.remove(Integer.valueOf(30));  // to remove the element.
//		System.out.println("List is: " + list);
//
//		list.clear(); // to delete all elements in the list.
//		System.out.println("List is: " + list);
//		System.out.println("List is Empty : " + list.isEmpty());
		
		// Forward using for loop
//		System.out.print("Forward (for loop): ");
//		for (int i = 0; i < list.size(); i++) {
//		    System.out.print(list.get(i) + " ");
//		}
//		System.out.println();
//
//		// Forward using for-each loop
//		System.out.println("Forward (for-each loop):");
//		for (Integer x : list) {
//		    System.out.println(x);
//		}
//
//		// Reverse order
//		System.out.println("Reverse order:");
//		for (int i = list.size() - 1; i >= 0; i--) {
//		    System.out.println(list.get(i));
//		}

//		ArrayList<Student> list = new ArrayList<>(); // for student class
//		list.add(new Student("Aniket", 21));
//		list.add(new Student("Raj", 20));
//		list.add(new Student("Ani", 12));
//		list.add(new Student("Manku", 17));
//		
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
		// TREE
//		TreeSet<Integer> set = new TreeSet<>();
//		
//		set.add(50);
//		set.add(40);
//		set.add(30);
//		set.add(20);
//		set.add(10);
//		System.out.println(set);
		
		
		// Hash-Map
		
		// HashMap<String, Integer> map = new HashMap<>();
		// LinkedHashMap<String, Integer> map = new HashMap<>();
//		TreeMap<String, Integer> map = new TreeMap<>();
//		
//		map.put("abc", 123);
//		map.put("xyz", 456);
//		map.put("pqr", 789);
//		map.put("lmn", 012);
//		
//		System.out.println(map);
		
		for(int i =1; i<=10; i++){
			new Test(); // unused object
			System.gc();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) { }
		}
	}
}


//class Student{
//	String name;
//	int age;
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public String toString() {
//		return this.name + ", " + this.age;
//	}
//}


class Test{
	public Test() {
		System.out.println("created: "+ this);
	}
	public void finalize() {
		System.out.println("Deleted: "+ this);
	}
}