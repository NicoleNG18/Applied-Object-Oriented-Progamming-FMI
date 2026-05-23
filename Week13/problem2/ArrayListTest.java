package problem2;

import java.util.*;

public class ArrayListTest {

    private ArrayList<String> list;

    public ArrayListTest() {
        list = new ArrayList<>(List.of("Лили", "Мария", "Георги", "Илия", "Цвета", "Георги"));
    }

    public static void printCommonElements(ArrayList<String> aList, ArrayList<String> bList) {
        for (String alistEl : aList) {
            for (String bListEl : bList) {
                if (alistEl.equals(bListEl)) {
                    System.out.printf("equal el: %s%n", bListEl);
                }
            }
        }
    }

    static void main() {
        ArrayList<String> aList = new ArrayList<>(List.of("Kaloyan", "Ivan", "Georgi", "Cveta"));
        ArrayList<String> bList = new ArrayList<>(List.of("Nikola", "Ivan", "Teodor", "Cveta"));

        printCommonElements(aList, bList);

        ArrayListTest arrayListTest=new ArrayListTest();
        ListIterator<String> nameIterator = arrayListTest.list.listIterator();

        while(nameIterator.hasNext()){
            String name=nameIterator.next();

            if(name.equals("Георги")){
                nameIterator.add("Симеон");
                break;
            }
        }

        System.out.printf("simeon added: %s%n",arrayListTest.list);
    }

}
