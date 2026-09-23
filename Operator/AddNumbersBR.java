import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AddNumbersBR {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter second number: ");
        int b = Integer.parseInt(br.readLine());

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }
}