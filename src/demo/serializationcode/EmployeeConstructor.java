//09 May 2022
package demo.serializationcode;

public class EmployeeConstructor implements java.io.Serializable {

    String name;
    String age;
    String id;
    String div;
    
    public void datacheck(){
        System.out.println ("\n" + name  + " " + age  + " " + id + " " + div +"\n");
    }

}
