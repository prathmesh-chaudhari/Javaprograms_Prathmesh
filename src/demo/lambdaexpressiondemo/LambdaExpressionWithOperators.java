
package demo.lambdaexpressiondemo;

// 20 May 2022


interface Adable {

    int add(int a, int b);
}

public class LambdaExpressionWithOperators {

    public static void main(String[] args) {
        Adable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(20, 60));

        Adable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(500, 100));

        Adable ad3 = (a, b) -> (a - b);
        System.out.println(ad3.add(100, 50));

        Adable ad4 = (int a, int b) -> {
            return (a * b);
        };
        System.out.println(ad4.add(40, 3));
    }
}