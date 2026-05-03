package test;

import model.Singleton;

public class SingletonTest {
    static void main() {
        Singleton instanceOne = Singleton.getInstance();
        instanceOne.setData("Singleton data one");
        
        Singleton instanceTwo = Singleton.getInstance();

        System.out.printf("Instance one: %s\n Instance two: %s\n", instanceOne, instanceTwo);
    }
}
