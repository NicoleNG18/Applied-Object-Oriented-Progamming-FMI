package problem3;

import java.util.function.BiFunction;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class LambdaDemo {

    static void main() {
        //a)
        IntConsumer intConsumer = System.out::println;
        //b)
        StringFunction stringFunctionAction = new StringFunction() {
            @Override
            public String function(String value) {
                return value.toUpperCase();
            }
        };
        //c)
        Supplier<String> string = () -> "Welcome to lambdas";
        //d)
        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 > num2 ? num1 : num2;
    }
}
