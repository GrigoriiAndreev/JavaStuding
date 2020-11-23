import java.util.*;

public class Test2 {

    public static class Cat{
        String name;
    }

    public static void main(String[] args) {

     /*   String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        //All variables initialization
        Map<String,Cat> map = new HashMap<>();



     /*   map.put("1", "First");
        map.put("2", "Srcond");
        map.put("3", "Third");
        map.put("4", "Fourth");

        for(Map.Entry<String, String> pair : map.entrySet()) System.out.println(pair.getKey() + ":" + pair.getValue());

//        for(String text : set) System.out.print(text + " ");


 /*   public static void printList(ArrayList<String> list) {
        System.out.println(list);
    }
    public static void printListReverce(ArrayList<String> list) {
        for (int i = list.size()-1; i != 0; i-- )
        System.out.print(list.get(i));

    }

    public static void removeLine(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).contains("р")) list.remove(i);

    }



 //       ArrayList<String> allNumbers = new ArrayList<>();
 //       int numberN = scanner.nextInt();
 //       int numberM = scanner.nextInt();


        ArrayList<String> allStrings = new ArrayList<>();
       ArrayList<Integer> all3Numbers = new ArrayList<>();
        ArrayList<Integer> allOtherNumbers = new ArrayList<>();
        ArrayList<Integer> allOtherNumbers = new ArrayList<>();



        allNumbers.add("mama");
        allNumbers.add("именно");
        allNumbers.add("мыла");
        allNumbers.add("именно");
        allNumbers.add("раму");

        removeLine(allNumbers);

        //Input inital Array
        String stopString;
        for (int i = 0; i != Integer.MAX_VALUE; i++ ) {
            stopString = scanner.next();
            if (stopString.equals("")) break;
            allStrings.add(stopString);
        }
       // for (int i = 0; i != numberM; i++ ) allNumbers.add(allNumbers.get(i));

        printList(allStrings);

       /* for (int i : allNumbers) {
            if (i % 2 == 0) all2Numbers.add(i);
            if (i % 3 == 0) all3Numbers.add(i);
            if (i % 2 != 0 && i % 3 != 0) allOtherNumbers.add(i);
        }


        printList(allNumbers);
/*
        System.out.println();

        allNumbers.remove(2);
        printList(allNumbers);
        printListReverce(allNumbers);
*/
      /*  printList(all2Numbers);
        System.out.println();
        printList(all3Numbers);
        */

    }

}
