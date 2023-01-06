package com.collection;



	
	public class Student implements Comparable<Student>
	{
		
		private String studentcode;
		private String studentname;
		private int age;
		private String state;
		
		
		
		public Student(String studentcode, String studentname, int age, String state) {
			super();
			this.studentcode = studentcode;
			this.studentname = studentname;
			this.age = age;
			this.state = state;
		}
		
		public String getStudentcode() {
			return studentcode;
		}
		public void setStudentcode(String studentcode) {
			this.studentcode = studentcode;
		}
		public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//public static String getState() {
			//return state;
		
		public void setState(String state) {
			this.state = state;
		}
		
		@Override
		public String toString() {
			return "Student [studentcode=" + studentcode + ", studentname=" + studentname + ", age=" + age + ", state="
					+ state + "]";
		}

		public int compareTo(Student student) {
			if (this.age > student.age)
				return age;
			else 
				return student.age;
		}

		public String getState() {
			// TODO Auto-generated method stub
			return null;
		}
		

	}