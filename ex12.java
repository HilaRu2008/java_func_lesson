import java.util.Random;

public class Tester12 {
    Random r = new Random();

    public static boolean f12(){

        Random r = new Random();
        int num1 = r.nextInt(6) + 1;
        int num2 = r.nextInt(6) + 1;
        System.out.println(num1);
        System.out.println(num2);
        if (num1 == num2)
            return true;
        else
            return false;


    }

    public static void main(String[]args){

        System.out.println(f12());

    }
}
