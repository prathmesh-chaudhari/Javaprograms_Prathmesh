// constructor in java used to initialize the objects also copy constructor is being used i.e. obj s4
// 9-april-22
// program prints info of  FAMILY

class Show     {
	String f_name, m_name, l_name, address, occupation;
	int age, mobile_no;
	
	Show()  {
		System.out.println("\nThis is a General Information about a family ----------\n");	
	}

	Show(String f_name, String m_name, String l_name, String address, String occupation, int age , int mobile_no)  {
		this.f_name = f_name;
		this.m_name = m_name;
		this.l_name = l_name;
		this.address = address;
		this.occupation = occupation;
		this.age = age;
		this.mobile_no = mobile_no;
	}

	void Line()  {
		System.out.println("\n-----------------------------------------------\n");
	}
}

class Constructor_prog  {
	public static void main(String args[]) {
		
		Show s1 = new Show ();
		
		s1.Line();
		Show s5 = new Show ("Pandurang ", "Hanumantrao ", "Khirloskar ", "234, RamNivas Colony", "Retired clerk", 75, 98459);
		
		System.out.println("The name is " + s5.f_name + s5.m_name + s5.l_name + "age " + s5.age );
		System.out.println("Occupation is " + s5.occupation + " resides at the address - " + s5.address + " contact number is " + s5.mobile_no);

		s5.Line();
		Show s6 = new Show ("Ramabai ", "Pandurang ", "Khirloskar ", "234, RamNivas Colony", "Housewife", 70, 93289);
		
		System.out.println("The name is " + s6.f_name + s6.m_name + s6.l_name + "age " + s6.age );
		System.out.println("Occupation is " + s6.occupation + " resides at the address - " + s6.address + " contact number is " + s6.mobile_no);

		s6.Line();

		Show s2 = new Show ("Prabhat ", "Pandurang ", "Khirloskar ", "234, RamNivas Colony", "Shopkeeper", 49, 99754);
		
		System.out.println("The name is " + s2.f_name + s2.m_name + s2.l_name + "age " + s2.age );
		System.out.println("Occupation is " + s2.occupation + " resides at the address - " + s2.address + " contact number is " + s2.mobile_no);
		
		s2.Line();
		Show s3 = new Show ("Mala ", "Prabhat ", "Khirloskar ", "234, RamNivas Colony", "Housewife", 46, 99643);
		
		System.out.println("The name is " + s3.f_name + s3.m_name + s3.l_name + "age " + s3.age );
		System.out.println("Occupation is " + s3.occupation + " resides at the address - " + s3.address + " contact number is " + s3.mobile_no);

		s3.Line();
		Show s4 = new Show ("Mangesh ", "Prabhat ", "Khirloskar ", "234, RamNivas Colony", "Student", 17, 98789);
		
		System.out.println("The name is " + s4.f_name + s4.m_name + s4.l_name + "age " + s4.age );
		System.out.println("Occupation is " + s4.occupation + " resides at the address - " + s4.address + " contact number is " + s4.mobile_no);

		
	}
}