import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(fileName);
 //       BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(fileName));
        BufferedReader bufferedReader1 =  new BufferedReader(fileName);
      //  FileReader reader = new FileReader(fileName);

        Scanner scanner = new Scanner(new FileInputStream(bufferedReader.readLine()));
//
//        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

//        while (true) {
//            String input = bufferedReader.readLine();
//            strings.add(input);
//            if (input.equals("exit")) break;
//        }

        while(scanner.hasNext()){
            int number = scanner.nextInt();
            integers.add(number);
        }
        for (int i : integers )
            System.out.println(i);



//       for(String string : strings)
//            bufferedWriter.write(string + "\n");

        bufferedReader.close();
  //      bufferedWriter.close();
    }


}
