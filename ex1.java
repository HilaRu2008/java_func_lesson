
import java.util.Scanner;

public class Tester {
    Scanner scan = new Scanner(System.in);
    public void f1()
    {
        System.out.println("enter your name: ");
        String name = scan.next();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args)
    {
        Tester test = new Tester();
        test.f1();
    }
}
