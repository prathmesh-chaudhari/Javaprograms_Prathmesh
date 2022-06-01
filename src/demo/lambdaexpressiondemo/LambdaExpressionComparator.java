
package demo.lambdaexpressiondemo;

// 20 May 2022
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Products {

    int id;
    String name;
    float price;
    int warranty;

    public Products(int id, String name, float price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

}

public class LambdaExpressionComparator {

    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products(1, "Dell Laptop", 80000f, 2));
        list.add(new Products(2, "Apple Mobile", 100000f, 4));
        list.add(new Products(3, "Keyboard", 1200f, 1));

        System.out.println("Sorting on the basis of the name...");

        //Implementing lambda expression
        Collections.sort(list, (p1, p2)
                -> {
            return p1.name.compareTo(p2.name);
        }
        );

        for (Products p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price + " " + p.warranty);
        }

    }
}
