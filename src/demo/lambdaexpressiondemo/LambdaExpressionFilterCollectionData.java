
package demo.lambdaexpressiondemo;

// 20 May 2022


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Products {

    int id;
    String name;
    float price;
    int warranty;

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

}

public class LambdaExpressionFilterCollectionData {

    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products(1, "Samsung A5", 1700f));
        list.add(new Products(2, "IPhone 6s", 65000f));
        list.add(new Products(3, "Sony Experia", 25000f));
        list.add(new Products(4, "Nokia Lumia", 15000f));
        list.add(new Products(5, "Redmi 11pro", 28000f));
        list.add(new Products(6, "Lenovo Vibe", 18000f));

        //using the lambda expression
        Stream<Products> filterdata = list.stream().filter(p -> p.price >= 20000);

        filterdata.forEach(products -> System.out.println(products.id + " " + products.name
                + " " + products.price));
    }
}
