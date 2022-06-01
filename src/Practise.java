// public class Practise {
//     // final static int i;
//     // int i = 20;
//     public static void main(String[] args) {
//     //     // i =20;  System.out.println(i);
//     //     // int[][] x = {{1,2,3,4,5}};
//     //     // byte b =10;     System.out.println(b);
//     //     // byte c =  (b+1);  System.out.println(c);
//     //     // byte d = b++;   System.out.println(d);
//     //     Practise x  = new Practise();   x.i = 50;
//     //    // x = new Practise(); 
//     //     System.out.println(x.i);

//         String s1 = "java";
//         String s2 = "java";
//         String s3 = "java";
//         s2.toUpperCase();
//         s3.toUpperCase();

//         boolean b1 = s1 == s2;
//         boolean b2 = s1 == s3;

//         System.out.println(b1); System.out.println(" " + b2);
//     }
// }

public class Practise {
    public Practise () {
        this("B");  System.out.println("A");
    }

    public Practise(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Practise m = new Practise();
        System.out.println("C");
    }
}