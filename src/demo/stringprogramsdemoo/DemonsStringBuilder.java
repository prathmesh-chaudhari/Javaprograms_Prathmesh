package demo.stringprogramsdemoo;

public class DemonsStringBuilder {
    
    void demonsstrbuild() {
        
        StringBuilder str = new StringBuilder("Hello! everyone I am your hoossstt ");
        System.out.println("new stringbuilder objet str - " + str.toString());

        // give host name (append)
        System.out.println(str.append("Michael"));

        //replace host name
        System.out.println(str.replace(35, 42, "No I am Joel your host"));

        //insert previous host name
        System.out.println(str.insert(35, "one and only Michael!! "));

        System.out.println("Joel I will delete you as a host");

        //delete joel host
        System.out.println(str.delete(58, 80));

        //use capacity method
        System.out.println("Michael you cannot delete me I'm superior I have capacity to store " + str.capacity() + " character");

        //use reverse method
        System.out.println("No Joel I'm superior because I can store it in reverse oder look -> " + str.reverse());

        //use ensureCapacity method
        System.out.println("Organizers (in there head) : \"we will ensure your absence in next event\"");
        str.ensureCapacity(150);
        System.out.println("Organizer set minnimum capacity to " + str.capacity() );
    }
}
