package learning.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {

 Map<String, Map<String, Map<Integer, String>>> districtMap = new HashMap<>();

        Map<Integer, String> postOfiiceHimechori = new TreeMap<>();
        postOfiiceHimechori.put(3661, "Gondapara");
        postOfiiceHimechori.put(3662, "Chor Voirobi");

        Map<String, Map<Integer, String>> upazilaOfChandpur = new TreeMap<>();
        upazilaOfChandpur.put("Hinechori", postOfiiceHimechori);
        districtMap.put("Chandpur", upazilaOfChandpur);

        System.out.println(districtMap.get("Chandpur").get("Hinechori"));




        /*Set<String> set = new TreeSet<>();
        set.add("Shamim");
        set.add("Arif");
        set.add("Rayhan");
        set.add("Arif");
        set.add("Tanha");
        set.add("Shamim");
        for(String s : set) {
            System.out.println(s);
        }

        System.out.println("Alternative Print:");
        for(int i=0; i<set.size(); i++) {
            System.out.println(set.toArray()[i]);
        }

        set.remove("Shamim");

        System.out.println(set);*/

        /*Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rashed");
        map.put(2, "Lorin");
        map.put(3, "Samrina");
        map.put(4, "Arif");
        map.put(4, "AAA");

        for(Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map);*/

       
    }
}
