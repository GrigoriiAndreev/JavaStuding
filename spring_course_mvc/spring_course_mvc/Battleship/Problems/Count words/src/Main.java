import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String sentence = reader.readLine();
        String sentence1 = sentence.trim();

        if (sentence1.isEmpty()) {
            System.out.println(0);
        } else {
            String[] word = sentence1.split("\\s+");
            System.out.println(word.length);
        }

        reader.close();
    }
}