import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BRSimpleInterest {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter principal: ");
        double p = Double.parseDouble(br.readLine());

        System.out.println("Enter rate: ");
        double r = Double.parseDouble(br.readLine());

        System.out.println("Enter time: ");
        double t = Double.parseDouble(br.readLine());

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest: " + si);
    }
}