package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);
        //ways to iterate through arraylist
        //1. For Loop
        for (int i = 0; i < arrayList.size(); i++) {
            String letter = arrayList.get(i);
            System.out.println(letter);
        }

        // 2. Using foreach loop
        for (String letter :
                arrayList) {
            System.out.println(letter);
        }

        //3. Using iterator
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String letter = iterator.next();
            System.out.println(letter);
        }

        //search an element using for loop
        for (String letter :
                arrayList) {
            if (letter.equals("D")){
                System.out.println("Element is found");
                break;
            }
        }

        //search using indexOf method
        int index = arrayList.indexOf("T");
        System.out.println("The element is found at index " + index);

    }
}
