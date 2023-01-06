package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("AF0216223", "Aryan Raj", 21, "Andra Pradhesh"));
		studentList.add(new Student("AF0216224", "Bivor Kumar", 22, "Andra Pradhesh"));
		studentList.add(new Student("AF0216227", "SUSHMITA KUMARI", 23, "Madhya Pradesh"));		
		studentList.add(new Student("AF0216231", "Ragiv Zafar", 24, "Maharashtra"));		
		studentList.add(new Student("AF0216232", "RAHUL MAHTO", 25, "Orissa"));		
		studentList.add(new Student("AF0216234", "Nainsi Kumari", 19, "Gujarath"));		
		studentList.add(new Student("AF0216236", "MD ALI", 26, "Madhya Pradesh"));		
		studentList.add(new Student("AF0216238", "ABHISHEK KUMAR", 22, "Andra Pradhesh"));		
		studentList.add(new Student("AF0216240", "AFROZ ANSARI", 21, "Maharashtra"));		
		studentList.add(new Student("AF0216259", "RITIK RAJ", 20, "Orissa"));		
		studentList.add(new Student("AF0216263", "Anant Kumar", 25, "Andra Pradhesh"));
		studentList.add(new Student("AF0216305", "BABU KUMAR", 24, "Gujarath"));		
		studentList.add(new Student("AF0216307", "NIKITA KUMARI", 23, "Madhya Pradesh"));		
		studentList.add(new Student("AF0216353", "PRANAV PANDEY", 22, "Orissa"));		
		studentList.add(new Student("AF0216964", "Radheshyam Kumar", 21, "Maharashtra"));		
		studentList.add(new Student("AF0216973", "Ankur Utpal", 19, "Gujarath"));		
		studentList.add(new Student("AF0217607", "Banty Mishra", 18, "Madhya Pradesh"));		
		studentList.add(new Student("AF0217615", "RIYA KUMARI", 20, "Karnataka"));
		studentList.add(new Student("AF0217791", "Priyadarshani Kumari", 21, "Maharashtra"));		
		studentList.add(new Student("AF0223373", "Chanchal Thakur", 22, "Orissa"));
		studentList.add(new Student("AF0221549", "SATENDRA KUMAR", 23, "Maharashtra"));
		studentList.add(new Student("AF0216212", "Pappi Verma", 24, ""));		
		studentList.add(new Student("AF0216244", "Ramkrishna Kushwah", 25, "Andra Pradhesh"));
		studentList.add(new Student("AF0216245", "Yogita Tamoliya", 26, "Orissa"));
		
		//Find the students aged over 20 age
		ArrayList<Student> studentListOver20 = new ArrayList<Student>();
		for (Student s : studentList) {
			if (s.getAge() > 20)
				studentListOver20.add(s);
		}
		System.out.println("Student List Over 20 : ");
		System.out.println(studentListOver20);
		
		//Find students from the state Andhra Pradhesh
		ArrayList<Student> studentListFromAndhra_Pradhesh = new ArrayList<Student>();
		for (Student s : studentList) {
			if (s.getState().equals("Andra Pradhesh"))
				studentListFromAndhra_Pradhesh.add(s);
		}
		System.out.println("Student List From Andhra Pradhesh : ");
		System.out.println(studentListFromAndhra_Pradhesh);
		
		//Sort students by their age
//		Comparator<Student> comparator = Collections.reverseOrder(new SortStudentByAge());
		Collections.sort(studentList,new SortStudentByAge());
		System.out.println("Student list after Age sort");
		System.out.println(studentList);
		
		Collections.sort(studentList,new SortStudentByName());
		System.out.println("Student list after Name sort");
		System.out.println(studentList);
		
		Collections.sort(studentList,new SortStudentByState());
		System.out.println("Student list after State sort");
		System.out.println(studentList);
	}

}

//sort the Age number...
class SortStudentByAge implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		
		if(s1.getAge() == s2.getAge()) {
			return 0;
		}
		else if(s1.getAge() > s2.getAge()) {
			return 1;
		}
		else 
			return -1;
	}
	
}


//sort the name  and the state///

class SortStudentByName implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		 return o1.getStudentname().compareTo(o2.getStudentname());
	}
	
}

class SortStudentByState implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		 return o1.getState().compareTo(o2.getState());
	}
	
}


	
	
	
