package problem1b;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericStackAsArrayListTest {

    private static class GenericStack<E> extends ArrayList<E> {

        public int getSize() {
            return size();
        }

        public E peek() {
            return get(getSize() - 1);
        }

        public void push(E o) {
            add(o);
        }

        public E pop() {
            E o = get(getSize() - 1);
            remove(getSize() - 1);
            return o;
        }

        public boolean isEmpty() {
            return super.isEmpty();
        }

        @Override
        public String toString() {
            return "stack: " + super.toString();
        }
    }

    static void main() {
        GenericStack<String> stringGenericStack=new GenericStack<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter text: ");
            stringGenericStack.add(sc.nextLine());
        }

        while(!stringGenericStack.isEmpty()){
            System.out.println(stringGenericStack.pop());
        }
    }
}
