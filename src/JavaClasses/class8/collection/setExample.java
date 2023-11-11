package JavaClasses.class8.collection;

import java.util.HashSet;
import java.util.Set;

public class setExample {
    public static void main(String[] args) {
        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        //duplicate element add, but in set it contain only single value
        color.add("Red");

        // Display the elements in the set
        System.out.println("Colors in the set: " + color); //Colors in the set: [Red, Blue, Green]

        boolean containBlue = color.contains("Blue");
        System.out.println("Contains Blue? " + containBlue);

        // Remove an element from the set
        color.remove("Green");

        // Display the updated set
        System.out.println("Colors after removing Green: " + color); //Colors in the set: [Red, Blue]

        // Get the size of the set
        int size = color.size();
        System.out.println("Size of the set: " + size);

        // Create a second set
        Set<String> moreColors = new HashSet<>();
        moreColors.add("Purple");
        moreColors.add("Orange");

        // Union of two sets (combining elements from both sets)
        color.addAll(moreColors);
        System.out.println("Union of colors and moreColors: " + color); //Union of colors and moreColors: [Red, Blue, Purple, Orange]

        // Intersection of two sets (common elements between sets)
        Set<String> commonColor = new HashSet<>(color);
        System.out.println("commonColor initial value:" + commonColor); //common color is:[Red, Blue, Purple, Orange]

        commonColor.retainAll(moreColors);
        System.out.println("Intersection of colors and moreColors: " + commonColor); //Intersection of colors and moreColors: [Purple, Orange]

    }
}
