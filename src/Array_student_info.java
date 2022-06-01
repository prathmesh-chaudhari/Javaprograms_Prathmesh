// 21 - april - 2022
class STudents {
    int rollno;
    String name;
    int age;
    String std;

    public STudents(int rollno, String name, int age, String std) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.std = std;
    }

}

public class Array_student_info {
    public static void main(String[] args) {
        STudents STudents[]; // created object in form of object

        STudents = new STudents[5]; // allocation of memory to array

        STudents[0] = new STudents(1, "Pratik", 13, "VIII th");
        STudents[1] = new STudents(2, "Aman", 13, "VIII th");
        STudents[2] = new STudents(3, "Suraj", 14, "VIII th");
        STudents[3] = new STudents(4, "Lokesh", 13, "VIII th");
        STudents[4] = new STudents(5, "Dharma", 14, "VIII th");

        for (int i = 0; i < STudents.length; i++) {
            System.out.print(
                    "The element at index " + i + " is information of student as --> rollno - " + STudents[i].rollno
                            + ", name - " + STudents[i].name);
            System.out.println(" of standard - " + STudents[i].std + ", age " + STudents[i].age);
        }
    }
}
