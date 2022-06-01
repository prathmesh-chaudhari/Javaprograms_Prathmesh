// 13 - april - 22
// program for application of concept multilevel inheritance

class Student {
    String RollNo, name, age;

    Student(String RollNo, String name, String age)  {
        this.RollNo = RollNo;
        this.name = name;
        this.age = age;
    }

    void Display() {
        System.out.println("\nThe name of the student is " + name + ". The Rollno. is " + RollNo + ". The age is " + age + ".\n");
    }
}

class Subject extends Student{

    int sub1, sub2, sub3, sub4, sub5;

    Subject (String RollNo, String name, String age, int sub1, int sub2, int sub3, int sub4, int sub5) {
        super(RollNo, name, age);
        this.sub1 = sub1;
        this.sub2 = sub2;       
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    void Show() {
        System.out.println("\nThe student secure marks as follows:\n" + "English : " + sub1);
        System.out.println("Marathi : " + sub2);
        System.out.println("Science : " + sub3);
        System.out.println("Sanskrut : " + sub4);
        System.out.println("Socal Studies : " + sub5);
    }
}

class Result extends Subject {

    int total;
    float percent;

    Result (String RollNo, String name, String age, int sub1, int sub2, int sub3, int sub4, int sub5) {
        super(RollNo, name, age, sub1, sub2, sub3, sub4, sub5);
        this.total = sub1 + sub2 + sub3 + sub4 + sub5 ;
        this.percent = (total/500.0f) * 100;  
    }

    void Student_info() {
        System.out.println("\nThe name of the student is " + name + ". The Rollno. is " + RollNo + ". The age is " + age + ".\n");
        System.out.println("\nThe student secure marks as follows:\n" + "English : " + sub1);
        System.out.println("Marathi : " + sub2);
        System.out.println("Science : " + sub3);
        System.out.println("Sanskrut : " + sub4);
        System.out.println("Socal Studies : " + sub5);
        System.out.println("Total = " + total);
        System.out.println("Student secured " + percent + "%");
    }

}

public class Multi_level_program {

    public static void main(String args[]) {
        
        Result r = new Result("IX0004", "Shirsath Yash", "15", 87, 76, 86, 45, 89);
        r.Student_info();
    }


}
