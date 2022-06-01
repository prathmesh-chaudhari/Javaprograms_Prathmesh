// Write a program to demonstrate having the main method in another class creating student class and display the basic information of the students.
// 11 - April - 22
class Student_1 {
	
	String name;
	String age;
	String std;

	Student_1 (String name, String age, String std)  {
		this.name = name;
		this.age = age;
		this.std = std;
		System.out.println ("\n" + name  + " " + age  + " " + std + "\n");

	}
}

class Student_info_cons {

	public static void main (String args[]) {
		Student_1 s1 = new Student_1 ("Name", "Age", "STD");
		Student_1 s2 = new Student_1 ("Hitesh Kamant", "14", "IX");
		Student_1 s3 = new Student_1 ("Yogesh Mule", "14", "IX");
		Student_1 s4 = new Student_1 ("Hitesh Kamant", "14", "IX");
	}
}