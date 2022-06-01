//  20 May 2022
package demo.lambdaexpressiondemo;

interface Sayble {

    public String say(String name, String working);
}

public class LambdaExpressionSingleArgumentDemo {

    public static void main(String[] args) {
        Sayble s1 = (name, working) -> {
            return "Hello from " + name + " . It is " + working + " Firm";
        };
        System.out.println(s1.say("Fuel, Pune", " Java Training"));

        Sayble s2 = (name, working) -> {
            return "Hello from " + name + " . It offers " + working;
        };
        System.out.println(s2.say("DIEMS", " B.Tech"));
    }
}
