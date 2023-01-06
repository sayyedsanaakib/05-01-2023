package com.collection;

import java.util.LinkedList;

public class LinkedList {
	

		public static void main(String[] args) {
			
			LinkedList<String> languages = new LinkedList<String>();
			languages.add("C");
			languages.add("C++");
			languages.add("Java");
			languages.add("Kotlin");
			languages.add("Python");
			languages.add("Perl");
			languages.add("Ruby");
			
			System.out.println(" List of languages"+languages);
			
			/*for(int i=0;i<=languages.size();i++)
				System.out.println(languages.get(i));*/
			
			
			
			System.out.println("Removed elements : "+languages.remove(5));
			System.out.println(languages);
			
			System.out.println(languages.remove("Kotlin"));
			System.out.println("List of elments after deleting kotlin");
			
			LinkedList<String> removelist = new LinkedList<String>();
			removelist.add("Python");
			removelist.add("Perl");
			removelist.add("Ruby");
			//			languages.removeAll(Arrays.asList("Python","Perl","Ruby"));
			languages.removeAll(list);		
			System.out.println("list of languages after deleting the elements python perl Ruby");	
			
			//remove all
			
			languages.removeAll(languages);
			System.out.println("List of languages after deleting all the elments ");
			
			System.out.println("elements after deleting all the elments:"+languages);
		}

	}
	