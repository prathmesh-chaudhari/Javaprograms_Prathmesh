
package demo.randomaccessfileclasss;

import java.io.Console;
public class RealPassworddemoConsole {
    public static void main(String[] args) {
        Console c = System.console();
        if (c == null){
            System.out.println("No console available.");
            return;
        }
        System.out.println("Enter username : ");
        String username = c.readLine();
        System.out.println("Enter password : ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("User Name : " + username);
        System.err.println("Password : " + pass);
    }
    
}
