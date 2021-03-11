import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String original = reader.readLine();
        StringBuffer reversed = new StringBuffer(original);

        System.out.println(reversed.reverse());


        reader.close();
    }
}