package hashmap;
import java.util.HashMap;
public class Hashmap_Demo {

    public static void main(String[] args) {
        
        HashMap<Integer,String> object = new HashMap<>();
        
        object.put(101, "Kamrul islam");
        object.put(102, "Aslam Ahmed");
        object.put(103, "Numan Ahmed");
        object.put(104, "Jesmin Begum");
        object.put(105, "Rahima Begum");
        object.put(106, "Laki Begum");
        
        System.out.println(object.get(101));
        System.out.println(object.get(102));
        System.out.println(object.get(103));
        System.out.println(object.get(104));
        System.out.println(object.get(105));
        System.out.println(object.get(106));
        
        /*
        [Array, arrayList, linkedList] index এর উপর ভিত্তি করে data store করে।।
        HashMap, key & value এর উপর ভিত্তি করে data store করে।।
        HashMap এর প্রাথমিক সূত্র: [key & value] put কর, তারপর get কর।। 
        */
    }
}
