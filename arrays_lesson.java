import javax.swing.plaf.SplitPaneUI;
import java.util.Scanner;
import java.util.Random;

public class arrays {
    static Scanner scan = new Scanner(System.in);
    static Random ran = new Random();

    public static void f1(int[] arr, int index){

        if ((index <= arr.length) && (index >= 0)){

            if (!(arr[index] % 2 == 0)){
                arr[index] += 1;
            }

        }else{
            System.out.println("error");
        }

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void f2(int[] arr){
        int sum = 0;
        int num;
        for (int i = 0; i < arr.length; i++){
            System.out.println("enter a num: ");
            num = scan.nextInt();
            arr[i] = num;
        }
        for (int j = 0; j < arr.length; j++){
            sum += arr[j];
        }
        System.out.println("the avg is: " + sum / arr.length);

    }

    public static void f3(int[] grades_arr){
        int min_num = grades_arr[0];
        int max_num = grades_arr[0];

        for (int i =1; i < grades_arr.length; i++){

            if (min_num > grades_arr[i]){
                min_num = grades_arr[i];
            }

            if (max_num < grades_arr[i]){
                max_num = grades_arr[i];
            }
        }
        System.out.println("max_num: " + max_num);
        System.out.println("min_num: " + min_num);

    }

    public static void f4(int[] arr){
        int former_val;
        int next_val;

        for (int i = 0; i < arr.length-1; i++){
            former_val = arr[i];
            next_val = arr[i + 1];
            if ((former_val + next_val) % 2 == 1){ // if the number is odd
                if ( i < arr.length - 2)
                    System.out.print((former_val + next_val) + ", ");
                else
                    System.out.print(former_val + next_val);

            }

        }
    }

    public static boolean f5(int num){

        int ran_num;
        int[] arr = new int[10];

        // insert random numbers to the array
        for(int i = 0; i < 10; i++){
            ran_num = ran.nextInt(101);
            arr[i] = ran_num;
        }

        for(int j = 0; j < arr.length; j++){
            if (arr[j] == num)
                return true;
        }
        return false;
    }


    public static void f6(int[] arr){
        int former_val;
        int next_val;

        for (int i = 0; i < arr.length-1; i++) {
            former_val = arr[i];
            next_val = arr[i + 1];
            if ((former_val + next_val) % 2 == 0) { // if the number is odd
                if (i < arr.length - 2)
                    System.out.print((former_val + next_val) + ", ");
                else
                    System.out.print(former_val + next_val);

            }

        }
    }

    public static void f7(){

        int[] arr = new int[10];
        int max_num = 0;
        int index_of_max_num = 0;
        int num;

        for (int i = 0; i < arr.length; i++){
            System.out.println("enter a number: ");
            num = scan.nextInt();
            arr[i] = num;
            if (num > max_num) {
                max_num = num;
                index_of_max_num = i;
            }
        }

        int temp = arr[index_of_max_num];
        arr[index_of_max_num] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for(int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");


    }

    public static int f8(int[] arr){

        int border = 3; // the border of the groups is always on index 3
        int group_right_sum = 0;
        int group_left_sum = 0;

        for (int i = 0; i < border; i ++)
            group_left_sum += arr[i];

        for (int j = border + 1; j < arr.length; j ++)
            group_right_sum += arr[j];

        if (group_left_sum == group_right_sum)
            return border;
        else
            return -1;

    }

    public static int f9(String[] arr){

        int a_count = 0;
        for (int element = 0; element < arr.length; element++){

             for (int index_letter = 0; index_letter < (arr[element].length()); index_letter++){

                     if (arr[element].charAt(index_letter) == 'a'){
                     a_count += 1;
                 }
             }
        }
        return a_count;

    }

    public static int f10(int[] arr, int num){

        int count = 0;
        for (int number = 0; number < arr.length; number++){

            if (arr[number] >= num)
                count++;
        }
        return count;
    }

    public static int f11(int arr[]){

        int max_num = 0;
        int smaller_num = 0;
        for (int i = 0; i < arr.length; i++){  // get the max num

            if (arr[i] > max_num)
                max_num = arr[i];
        }

        for (int j = 0; j < arr.length; j++){

            if ((arr[j] > smaller_num) && (arr[j] < max_num)) {
                smaller_num = arr[j];
            }

        }

        return smaller_num;
    }

    public static void f12(int[] arr){

        int ran_num = ran.nextInt(10);
        System.out.println("random num: " + ran_num);

        for (int i = 0; i < arr.length; i++){

            if (ran_num == arr[i]){
                for (int j = i; j < arr.length; j++)

                    if (!(j == arr.length - 1)){
                        arr[j] = arr[j + 1];
                        i -= 1;}
                    else
                        arr[j] = 0;


            }

        }

        for (int h = 0; h < arr.length; h++)
            System.out.println(arr[h] + " ");
    }

    public static void f13(){

        int[] arr = new int[30];
        for (int num_arr = 0; num_arr < arr.length; num_arr++){
            int num = ran.nextInt(10);
            arr[num_arr] = num;
        }

        /*
        for (int h =0; h< arr.length; h++){
            System.out.print(arr[h] + " ");
        }
        */


        //int double_num = 0;
        int counter = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){

                if (arr[i] == arr[j] && i != j)
                    counter++;

            }

            if (counter == 2) {
                System.out.println("\n" + arr[i]);
                arr[i] = -1;
            }
            counter = 1;

        }
    }

    public static void f14(){

        int[] arr = new int[10];
        int num = 0;


        for (int i = 0; i < 10; i++){
            num = ran.nextInt(100);
            arr[i] = num;
        }
        for (int h =0; h< arr.length; h++){
            System.out.print(arr[h] + " ");  /// the original array
        }
        System.out.println();

        for (int j = arr.length - 1; j >= 0; j--){  /// opposite array
            System.out.print(arr[j] + " ");
        }
    }

    public static boolean f15(int[] arr){

        for (int i = 0; i < arr.length; i++){
            if(!(arr[i] == arr[arr.length - 1 - i])){
                return false;
            }
        }
        return true;


    }








    public static void main(String[]args){

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        int[] arr3 = {100, 20,34,50,19,99};
        int[] arr4 = {1,2,3,4,2,6,7,8,10,10};
        int[] arr8 = {4, -2, 3, 9, 8, -3};
        String[] arr9 = {"aba", "saba", "ana", "rony","shuki"};
        //f1(arr1, 4);  // the change is saved
        //f2(arr2);
        //f3(arr3);
        //f4(arr4);
        //System.out.println(f5(36));
        //f6()
        //f7();
        //System.out.println(f8(arr8));
        //System.out.println(f9(arr9));
        //System.out.println(f10(arr4, 5));
        //System.out.println(f11(arr1));
        int[] arr12 = {1,3,4,3,2,8,9};
        //f12(arr12);
        //f13();
        //f14();
        int[] arr15 = {1,2,3,2,1};
        System.out.println(f15(arr15));
    }
}
