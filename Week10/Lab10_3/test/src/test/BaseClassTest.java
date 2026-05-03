package test;

import model.BaseClass;
import model.DerivedClass;

public class BaseClassTest {
    static void main() {
        BaseClass baseClass = new DerivedClass();

        baseClass.firstMethod();
    }
}
