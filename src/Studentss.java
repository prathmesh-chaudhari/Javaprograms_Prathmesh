// Write a program to demonstrate having the main method in another class creating student class and display the basic information of the students.
// 11 - April - 22

class Student {
	
	String f_name;
	String id;
	String l_name;

	Student (String name, String id, String std)  {
		this.f_name = name;
		this.id = id;
		this.l_name = std;
		System.out.println ("\n" + id  + "	" + f_name  + "	" + l_name + "\n");

	}
}

class Studentss {

	public static void main (String args[]) {
		Student s1 = new Student ("First Name", "ID", "Last Name");
		Student s2 = new Student ("Hitesh", "14463775", "Kamant");
		Student s3 = new Student ("Yogesh", "14466554", "Mule");
		Student s4 = new Student ("Hitesh", "146363367", "Kamant");
		
	}
}