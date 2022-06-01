//  20 May 2022
package demo.lambdaexpressiondemo;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionLoop {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Amul");
        list.add("Dhuudh");
        list.add("Pita");
        list.add("Hai");
        list.add("India");

        list.forEach((n) -> System.out.print(n + " "));
    }
}
