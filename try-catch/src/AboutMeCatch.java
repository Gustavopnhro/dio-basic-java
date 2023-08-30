import java.util.Scanner;
import java.util.Locale;


public class AboutMeCatch {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


            System.out.println("Name ");
            String name = scanner.next();

            System.out.println("Lastname ");
            String lastname = scanner.next();

            System.out.println("Age ");
            Integer age = scanner.nextInt();


            System.out.println("My name is " + name + " " + lastname );
            System.out.println("I'm " + age + " years old");
        } catch (Exception e) {
            System.out.println("input a valid value!");
        }
            

        }
}
