import java.util.Scanner;

public class Tester13 {

    public static boolean f13(char tav){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a 4-letter string: ");
        String str = scan.next();
        if (str.charAt(0) == tav || str.charAt(1) == tav ||str.charAt(2) == tav || str.charAt(3) == tav)
            return true;
        else
            return false;

    }

    public static void main(String[]args){

        System.out.println(f13('a'));

    }
}
