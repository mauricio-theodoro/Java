import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String N22 = reader.readLine();
            int N2 = Integer.parseInt(N22);
            String N33 = reader.readLine();
            double N3 = Double.parseDouble(N33);
            String N = reader.readLine();

            System.out.println("String: " + N);
            System.out.println("Double: " + N3);
            System.out.println("Int: " + N2);

    }
}