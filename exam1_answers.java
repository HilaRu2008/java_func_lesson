
import java.util.Scanner;
import java.util.Random;

public class Answers_to_exam {
     Scanner scan = new Scanner(System.in);

    public static void question1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter eldest son's age: ");
        int eldest_son = scan.nextInt();
        int youngest_son = eldest_son - 10;
        int young_daughter = eldest_son - 9;
        int older_daughter = eldest_son - 6;

        System.out.println("eldest son age: " + eldest_son);
        System.out.println("younger son age: " + youngest_son);
        System.out.println("young daughter age: " + young_daughter);
        System.out.println("eldest daughter age: " + older_daughter);
    }


    public static void question2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 3-digit-num: ");
        int num = scan.nextInt();

        System.out.println("" + num % 10 + num % 100 / 10 + num / 100);

    }


    public static void question3(){
        Random r = new Random();
        int grade1 = r.nextInt(61) + 40;
        int grade2 = r.nextInt(61) + 40;
        int grade3 = r.nextInt(61) + 40;

        int min_number = grade1;

        if (grade2 < min_number)
            min_number = grade2;

        if (grade3 < min_number)
            min_number = grade3;

        System.out.println("min number: " + min_number);



    }

    public static void question4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter string 1: ");
        String str1 = scan.next();
        System.out.println("enter string 2: ");
        String str2 = scan.next();

        if (str1.length() > str2.length())
            System.out.println(str1);
        else
            System.out.println(str2);


        String sub_str1 = str1.substring(0,3);
        String sub_str2 = str2.substring(0,3);

        System.out.println("substring str1 : " + sub_str1);
        System.out.println("substring str2 : " + sub_str2);


        if (sub_str1.compareTo(sub_str2) < 0)
            System.out.println("the biggest substring: " + sub_str1);
        else
            System.out.println("the biggest substring: " + sub_str2);



    }



    public static void main(String[]args){

        question1();
        question2();
        question3();
        question4();



    }
}
