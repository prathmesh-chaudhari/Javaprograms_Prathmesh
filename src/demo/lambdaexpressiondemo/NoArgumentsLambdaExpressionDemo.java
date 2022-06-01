//  20 May 2022
package demo.lambdaexpressiondemo;

interface Drawable {

    public void draw();
}

public class NoArgumentsLambdaExpressionDemo {

    public static void main(String[] args) {
        /*  without labda expression
        int w = 10;
        Drawable dd = new Drawable();{
            public void draw(){
                sout("Drawing : " + w);
            }
        };
        dd.draw();
        
         */
        Drawable dd = () -> {
            int w = 10;
            System.out.println("Drwaing : " + w);
        };
        dd.draw();
    }
}
