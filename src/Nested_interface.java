// 15 - April - 2022
// program for nested interface concept



interface Showable {
    void show ();
    interface Message {
        interface Messsage1  {
            void msg();
        }
    }
}

class Displayshow implements Showable  {
    public void show () {
        System.out.println("print show method");
    }
}


public class Nested_interface  implements Showable.Message.Messsage1  {
    public void msg ()  {
        System.out.println("hello nested interface");
    }
    public static void main(String[] args) {
    

        Showable.Message.Messsage1 message = new Nested_interface();
        message.msg();

        Displayshow display = new Displayshow();
        display.show();
    }

}
