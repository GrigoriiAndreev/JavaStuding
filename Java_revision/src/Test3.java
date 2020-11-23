import java.util.*;

public class Test3 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");

        for(String text : set) System.out.print(text + " ");
        System.out.println();

        List<Double> list = new ArrayList<>();

        list.add(1.1);
        list.add(2.3745);
        list.add(2.595);
        list.add(4.12);

        for (Double digit : list) System.out.print(digit + " ");
        System.out.println();

        Map<Integer,String> map = new HashMap<>();

        map.put(1, "First");
        map.put(2, "Srcond");
        map.put(3, "Third");
        map.put(4, "Fourth");

        for(Map.Entry<Integer, String> pair : map.entrySet()) System.out.println(pair.getKey() + ":" + pair.getValue());


    }
}
