// 21 - april - 2022
class STUdent {
    int rollno;
    String name;

    public STUdent(int rollno, String name) {
        this.rollno = rollno;
        this.name = "name - " + name;
    }

}

public class ArrayObjectDemo {
    public static void main(String[] args) {
        STUdent student[]; // created object in form of object

        student = new STUdent[5]; // allocation of memory to array

        student[0] = new STUdent(1, "Pratik");
        student[1] = new STUdent(2, "Aman");
        student[2] = new STUdent(3, "Suraj");
        student[3] = new STUdent(4, "Lokesh");
        student[4] = new STUdent(5, "Dharma");

        for (int i = 0; i < student.length; i++) {
            System.out.println(
                    "The element at index " + i + " is rollno - " + student[i].rollno + " and " + student[i].name);
        }
    }
}
