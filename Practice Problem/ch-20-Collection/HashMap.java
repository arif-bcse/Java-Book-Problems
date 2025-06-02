package learning.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

class Main{
    public static void main(String[] args) {
        HashMap<String,Integer> student = new HashMap<>();
        TreeMap<Integer, Character> tree = new TreeMap<>();
        tree.put(2,'k');
        tree.put(3,'p');
        System.out.println(tree);
        student.put("Arif",62);
        student.put("Ratul",64);
        student.put("Minhaz",53);
        student.put("shishir",52);
        System.out.println(student);

        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(4);
        System.out.println(set);
    }
}
