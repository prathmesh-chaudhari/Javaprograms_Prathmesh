
package demo.lambdaexpressiondemo;

// 20 may 2022


interface StringFunction {

    String run(String s);
}

public class LambdaWithStringDemo {

    public static void main(String[] args) {
        StringFunction ex = (s) -> s + "!";
        StringFunction ex1 = (s) -> s + "?";
        printFormatted("Hello", ex);
        printFormatted("Hello", ex1);
    }

    public static void printFormatted(String ex, StringFunction format) {
        String result = format.run(ex);
        System.out.println(result);

    }
}

