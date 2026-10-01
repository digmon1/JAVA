import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Exception;

class StudentInfoBR {
    public static void main(String... args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = br.readLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}