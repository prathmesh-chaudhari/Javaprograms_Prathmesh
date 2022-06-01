// 09 May 2022
package demo.student_package;

public class Student_class implements java.io.Serializable {

    String fname;
    String lname;
    int rollno;
    String address;
    int mobile_no;
    double percentage;
    
     public void datacheck(){
        System.out.println ("\n"+ "First name: " + fname  + " Last name: " + lname  + 
                " Rollno: " + rollno + "\n" + " Address: " + address + 
                " Mobile_no: " + mobile_no + " Percentage: " + percentage +"\n");
    }
}
