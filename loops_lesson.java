/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;

public class Main {
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

        if(flag){
            System.out.println("this is a palindrome");


        }

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

        int a = 1, b = 1;
        while (a <= num) { // while the checking number is smaller than the num we want to find (because when it is bigger the number will not be found couse fibo series is only growing)
            
            if (a == num || b == num){
                return true;
            }
            
            else{
                a += b;  // first promoting the a because 'a' is used as a limit for the loop
                b += a;
            }

        }
        
        return false;



    }
    
    
    
    public static void f9(int num1, int num2){
        
        int number = 0;
        for(int i = 0; i < num1; i++){
            number += num2;
        }
        System.out.println(number);
        
    }
    
    public static void f10(int heighet){
        
        int max_anount_of_asterisk = (heighet * 2) - 1;  // to get the max amount of asterisk (in the base of the triangle)
        // max_anount_of_asterisk = 7
        
        for (int i = 1; i <= max_anount_of_asterisk; i+=2){ // to make sure that the program wont run more asterisks lines than needed ( = the amont of asterisks we want to print in each line)
            int amount_of_spaces_needed_on_every_side = (max_anount_of_asterisk - i) / 2;
            
            // System.out.print(amount_of_spaces_needed_on_every_side);
            for (int space = 0; space < amount_of_spaces_needed_on_every_side; space++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++){  // j is the amount of asterisk in every line
                System.out.print('*');
            }

            
            System.out.println();
            

        }
        
    }
        
        
    public static void f11(int a1, int d, int n){
        
        int an;
        
        for (int first_distance = 1; first_distance <= n; first_distance++){
            
            an = a1 + d * (first_distance - 1);
            
            if (first_distance == n)
                System.out.print(an);
                
            else
                System.out.print(an + ", ");
                
    
        }
        
    }
    
    
    public static void f12(int index1, int index2){ 
        
        // if index1 < index2

        int a = 1;
        int b = 1;
        
        for (int i=1; i < index2; i++) {  // i = 3
            
            
            if (i % 2 == 0){
                if (i >= index1)
                    System.out.println(b);
                b += a;
            }
                
            else{
                
                if (i >= index1)
                    System.out.println(a);
                a += b;
                
            }
                
        }
    }
    
    
    
    public static void f13(int h){
        
        int num_of_asterisks_in_the_sub_base = h + (2 * (h - 1));
        //System.out.println(num_of_asterisks_in_the_sub_base);  // working
        
        
        for(int col = 0; col < h; col++){
            
            int num_of_asterisks_in_every_line = h + (2 * col);
            int needed_spaces_on_each_side = (num_of_asterisks_in_the_sub_base - num_of_asterisks_in_every_line) / 2;
            
            //System.out.println("num of asterisks in every line: " + num_of_asterisks_in_every_line); // working
            //System.out.println("needed spaces on each side: " + needed_spaces_on_each_side);  // working
            
            
            for (int row = 0; row < num_of_asterisks_in_the_sub_base; row++){
                
                if (row < num_of_asterisks_in_the_sub_base - num_of_asterisks_in_every_line - needed_spaces_on_each_side  ||  row >= num_of_asterisks_in_the_sub_base - needed_spaces_on_each_side){ 
                    
                    //row < num_of_asterisks_in_the_sub_base - num_of_asterisks_in_every_line - needed_spaces_on_each_side:
                    // check if the index of the row is smaller than the index of the first astrisk --> print a space if so
                    
                    //row >= num_of_asterisks_in_the_sub_base - needed_spaces_on_each_side: 
                    // checks if the row (index) got to a index we need to start printing spaces again (the condition gets the index after the last index asterisk in a row  
                    
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                
            }
            System.out.println();
            
            
        }
        
        
        
        
        
        
        
    }



    public static void main(String[]args){

        // System.out.println(f8(6));
        f13(5);

    }


}
