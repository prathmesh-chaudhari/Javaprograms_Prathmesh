import javax.sql.rowset.spi.SyncResolver;

// 16 - april - 2022
// program of static block created many times


public class Static_block {

    static {    System.out.println("static block 1 Executed");}

    static {    System.out.println("Static block 2 Executed");}

    static {    System.out.println("Static block 3 Executed");}
    public static void main(String[] args) {
        System.out.println("Execute main block");
    }
}
