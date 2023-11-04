package JavaClasses.class8.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> list1 = new ArrayList<>();

        // Adding elements to the list
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Banana");

        // Accessing elements by index
        String firstElement = list1.get(0); // Retrieves "Apple"
        String secondElement = list1.get(1); // Retrieves "Orange"

        // Checking if an element is in the list
        boolean containsBanana = list1.contains("Banana"); // Returns true

        // Getting the size of the list
        int size = list1.size(); //return 3

        // Removing an element by index
        list1.remove(2); // Removes "Banana"

        // Iterating through the list using a for-each loop
        for (String str:list1){
            System.out.println(str);
        }
        System.out.println("================================");

        //create another array list
        List<String> list2 = new ArrayList<>();
        list2.add("Cherry");
        list2.add("Fig");
        list2.add("Grapes");
        list2.add("Apple");

        // Use the addAll method to add all elements from list2 to list1
        list1.addAll(list2);

        // Display the contents of list1 after adding all elements from list2
        for (String fruit : list1) {
            System.out.println(fruit);
        }

        // Find the index of "Cherry"
        int index = list1.indexOf("Cherry");
        if (index != -1){
            System.out.println("Index of Cherry: " + index);
        }else{
            System.out.println("Cherry not found in the list.");
        }

        // Find the index of "Apple" duplicate
        int index2 = list1.indexOf("Apple");
        if (index2 != -1){
            System.out.println("Index of Apple: " + index2);
        }else{
            System.out.println("Apple not found in the list.");
        }


        // Clear the list
        list1.clear();

        // Check if the list is empty
        boolean isListEmpty = list1.isEmpty();
        System.out.println("Is List1 is Empty : "+isListEmpty);

    }

}
