package test;

import com.Functions;
import com.Tabulate;
import services.Computable;

public class TabulateTest {
    static void main() {
        Functions functions = new Functions();
        Tabulate tabulate = new Tabulate(functions.getSinFunction());
        tabulate.tabulate(1, 100, 10);
        System.out.println();

        Computable anonymousObject = new Computable() {
            @Override
            public double function(double x) {
                return 1 / x;
            }
        };
        Tabulate.tabulateFunction(1, 100, 10, anonymousObject);
    }
}
