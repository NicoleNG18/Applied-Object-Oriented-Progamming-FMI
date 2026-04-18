package stack;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Object> list;

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.getLast();
    }

    public Object pop() {
        Object lastObj = list.getLast();
        list.remove(lastObj);
        return lastObj;
    }

    public void push(Object obj) {
        list.add(obj);
    }
}
