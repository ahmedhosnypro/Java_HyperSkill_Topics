import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine().trim();
        reader.close();
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] strings = str.split("\\s+");
            int length = strings.length;
            System.out.println(strings.length);
        }
    }
}