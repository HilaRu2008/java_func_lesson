import java.util.Scanner;

public class exarsise {
    static Scanner scan = new Scanner(System.in);

    public static void f1(){

        double sum = 0;
        int counter = 0;
        for(counter = 0; counter < 5; counter++){
            System.out.println("enter grade: ");
            int grade = scan.nextInt();
            sum += grade;

        }

        System.out.println(sum / 5);

    }


    public static void f2(){

        int counter = 0;
        String word;

        do{
            System.out.println("enter word: ");
            word = scan.next();
            counter ++;

        } while (!(word.equals("enter"))); // false == (word.equals("enter"))
        System.out.println(counter);

    }

    public static void f3(int number){

        int num_of_tries = 0;

        do{
            System.out.println("enter code: ");
            int try_number = scan.nextInt();
            num_of_tries ++;
            if (number == try_number){  // if the input is equal to the code given
                System.out.println("how much money");
                break;  // when the input is correct: stop the loop
            }
            else
                System.out.print("error\n");  // while the input is incorrect: continue the loop

        }while (num_of_tries <= 2);  // while the amount of tries is smaller than 4


    }

    public static void f4(String word) {

        int last_index = word.length() - 1;  // last index of the word
        boolean flag = true;
        int i;

        for (i = 0; i < word.length(); i++) {

            if (!((word.charAt(i) == word.charAt(last_index - i)))) {  // if one char is not the same as the other char (char is primitive so use == and not equals!)
                System.out.println("not palindrome");
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("this is a palindrome");


        }

    }

    public static void f5(int num){

        int i;
        for (i = 1; i <= num;  i++){

            if (i < num) {
                System.out.print(num % 10 + ", ");
                num /= 10;
            }
            else
                System.out.print(num % 10);

        }

    }


    public static void f6(){

        int i,j;
        for (i = 1; i <= 10; i++){

            for (j = 1; j < 10; j++){
                System.out.print((j * i) + " ");
            }

            System.out.println();

        }
    }

    public static void f7 (){

        Scanner scan = new Scanner(System.in);
        int min_grade = 100;
        int max_grade = 0;

        for (int i = 0; i < 7; i++){
            System.out.println("enter a grade: ");
            int grade = scan.nextInt();

            if (grade < min_grade)
                min_grade = grade;

            if (grade > max_grade)
                max_grade = grade;

        }
        System.out.println("max grade:  " + max_grade);
        System.out.println("min grade:  " + min_grade);
    }


    public static boolean f8 (int num){

        int fibo_num = 1;
        while (num != fibo_num) {
            fibo_num += fibo_num

        }



    }



    public static void main(String[]args){

        f7();

    }


}
