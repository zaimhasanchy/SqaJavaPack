package JavaClasses.class8.collection;

import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap to store specific info pair for a person
        //Map<String, Objects> allow to pass any type of data in object
        //Map<String, Integers> allow key as a string and value must be integer
        Map<String, Object> mapObj = new HashMap<>();
        mapObj.put("Name","Hasan");
        mapObj.put("Age",35);
        mapObj.put("CGPA", 3.84);

        System.out.println(mapObj); //{CGPA=3.84, Age=35, Name=Hasan}
        mapObj.put("salary",50000);

        // Create a another hashmap
        Map<String, Object> map2Obj=new HashMap<>();
        map2Obj.put("Subject", "CSE");
        map2Obj.put("Gender","Male");

        //add this map2Obj in mapObj
        mapObj.put("map2",map2Obj);

        System.out.println(mapObj); //{map2={Gender=Male, Subject=CSE}, CGPA=3.84, salary=50000, Age=35, Name=Hasan}

        // Get the age
        System.out.println("Age is: "+mapObj.get("Age")); //Age is: 35

        // Check if the map contains a specific name key
        boolean containsCgpaKey = mapObj.containsKey("CGPA");
        System.out.println("Is CGPA key available ? "+containsCgpaKey); //Is CGPA key available ? true

        // Check if the map contains a specific value available
        boolean containsHasanValue = mapObj.containsValue("Hasan");
        System.out.println("Is Hasan value available? "+containsHasanValue); //Is Hasan value available? true

        // Remove an entry from the map
        mapObj.remove("salary");
        System.out.println("After remove salary key, map is: "+mapObj); //After remove salary key, map is: {map2={Gender=Male, Subject=CSE}, CGPA=3.84, Age=35, Name=Hasan}

        // Get all keys in the map
        Set<String> strKey=mapObj.keySet();
        System.out.println("All the keys of mapObj: " +strKey); //All the keys of mapObj: [map2, CGPA, Age, Name]

        //get all the values of map
        for(Object val:mapObj.values()){
            System.out.println(val);

        }
//        output
////      {Gender=Male, Subject=CSE}
////      3.84
////      35
////      Hasan


    }
}
