package problem1;

import java.util.Arrays;

public class GenericStackProvider {

    private static class GenericStack<E> {

        private E[] array = (E[]) new Object[10];
        private int index = 0;

        public int getSize() {
            return index;
        }

        public E peek() {
            if (isEmpty()) {
                return null;
            }
            return array[getSize() - 1];
        }

        public void push(E o) {
            if (index == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[index++] = o;
        }

        public E pop() {
            if (isEmpty()) {
                return null;
            }
            E o = array[getSize() - 1];
            array[getSize() - 1] = null;
            index--;

            return o;
        }

        public boolean isEmpty() {
            return index == 0;
        }

        @Override
        public String toString() {
            return "stack: " + Arrays.toString(array);
        }
    }

    static void main() {
        GenericStack<Integer> genericStack = new GenericStack<>();

        for (int i = 0; i < 11; i++) {
            System.out.printf("pushing: %d%n",i);
            genericStack.push(i);
        }

        System.out.printf("size: %d%n",genericStack.getSize());

        int currSize=genericStack.getSize();
        for (int i = 0; i < currSize; i++) {
            Integer element = genericStack.pop();

            System.out.printf("Poping: %d%n",element);
        }

        GenericStack<String> stringGenericStack=new GenericStack<>();
        for (int i = 0; i < 11; i++) {
            stringGenericStack.push(String.format("text %d",i));
        }

        while(!stringGenericStack.isEmpty()){
            System.out.println("pop: "+stringGenericStack.pop());
        }
    }

}