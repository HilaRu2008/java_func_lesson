
import java.util.Random;

public class _2D_array {

    static Random ran = new Random();


    public static void f1(int col, int row) {

        int ran_num = 0;
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                ran_num = ran.nextInt(100);
                arr[i][j] = ran_num;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }

            System.out.println();
        }
    }

    public static void f2() {

        int[][] arr = new int[3][3];
        int ran_num;
        int max_line_val = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ran_num = ran.nextInt(100);
                arr[i][j] = ran_num;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (max_line_val < sum) {
                max_line_val = sum;
                sum = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("max line numbers: " + max_line_val);
    }


    public static void f3(int cols_rows) {

        int[][] arr1 = new int[cols_rows][cols_rows];
        int[][] arr2 = new int[cols_rows][cols_rows];
        int[][] arr3 = new int[cols_rows][cols_rows];

        int ran_num;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                ran_num = ran.nextInt(100);
                arr1[i][j] = ran_num;

            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                ran_num = ran.nextInt(100);
                arr2[i][j] = ran_num;

            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("arry1: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("arry2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("arry3: ");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static void f4(int number) {

        int[][] arr = new int[number][number];
        int ran_num = 0;

        System.out.println("\narry 1: \n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ran_num = ran.nextInt(10);
                arr[i][j] = ran_num;
                System.out.print(arr[i][j] + "  ");

            }

            System.out.println();


        }

        System.out.println("\narry 2: \n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[j][i] + "  ");

            }

            System.out.println();
        }
    }


    public static void f5(int[][] arr) {


        int col_length = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            col_length = arr[i].length - 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)
                    sum += arr[i][j];
            }
        }


        for (int i = 0; i < arr.length; i++) {

            System.out.println("i: " + i + ", col_len:" + col_length);
            sum += arr[i][col_length];
            col_length--;


        }

        System.out.println("sum:  " + sum);
    }

    public static boolean f6(int[][] arr) {

        int value;
        for (int i = 0; i < arr.length; i++) {
            value = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {

                if (value < arr[i][j])
                    value = arr[i][j];
                else
                    return false;


            }
        }

        return true;

    }


    public static boolean f7(int[][] arr) {

        int power = 0;  // the power of the numbers
        int binary_digit_2_decimal = 0;
        int current_num = 0;
        int min_num = 0;


        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {

                binary_digit_2_decimal = (int) (arr[row][col] * (Math.pow(2, power)));
                power++;
                current_num += binary_digit_2_decimal;
            }
            power = 0;


            if (current_num >= min_num) {
                min_num = current_num;
                current_num = 0;
            } else
                return false;

        }

        return true;
    }

    public static void f8(char[][] arr) {
        char value;
        int counter_cols = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");



        for (int i = 0; i < arr.length; i++) {  // iterate every letter
            for (int letter_i = i + 1; letter_i < arr.length; letter_i++) {  // for every iteration go over every letter under the letter

                while (counter_cols < arr[i].length) {  // if the values are equal ++ the col

                    if (arr[letter_i][counter_cols] == arr[i][counter_cols])
                        counter_cols++;

                    else {
                        if (arr[letter_i][counter_cols] < arr[i][counter_cols]) {

                            for (int col = 0; col < arr[i].length; col++) {
                                value = arr[i][col];
                                arr[i][col] = arr[letter_i][col];
                                arr[letter_i][col] = value;
                            }
                            counter_cols = 0;
                        }

                        break;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


/*
    public static boolean f9(char arr [][], String name){

        String text;
        boolean flag = false;
        for (int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){

                text = "";
                text += arr[i][j];

                if (!(text.equals(name))){

                    for (int x=j+1; x<arr.length; x++){
                        text += arr[i][x];
                        if (! (text.equals(name)))
                            continue;

                        else
                            return true;
                    }

                    if (!(flag)){


                    }

                }


            }

        }



    }

    */


    public static boolean f9(char arr [][], String name){

        String text;
        int x;
        int y;
        boolean flag = false;

        // to check evey match of words without the previous letters so we can check all possible letter match
        for (int i=0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {


                x = j;
                text="";


                // Horizontal search

                do {
                    text += arr[i][x];  // every time add a new letter(in the line) to the word  to see if we'll get a match
                    x++;

                // keep checking more letter matches while a match not found + we are out of letters in the line
                } while (!(text.equals(name)) && (x < arr[i].length));

                if (text.equals(name))
                    return true;

                y = i;
                text="";

                // Vertical search
                do {
                    text += arr[y][j];
                    y++;

                } while (!(text.equals(name)) && (y < arr.length));


                if (text.equals(name))
                    return true;

            }
        }

        return false;

        /// checking needed



    }






    public static void main(String[]args){

        //f1(3, 3);
        //f2();
        //f3(3);
        //f4(3);
        int[][] arr= {{1,2,3}, {4,5,6}, {7,8,9}};
        //f5(arr);
        //System.out.println(f6(arr));
        int[][] binary_arr= {{0,1,1,1}, {0,0,1,1}, {0,1,1,1},{0,0,0,1}};
        //System.out.println(f7(binary_arr));
        char[][] arr8 = {{'h', 'i', 'l', 'a'}, {'a','b','c','d'}, {'h', 'b', 'l', 'a'}, {'h', 'a', 'l', 'a'}};
        //f8(arr8);
        char[][] arr9 = {{'h', 'i', 'l', 'b'}, {'a','b','c','d'}, {'h', 'b', 'l', 'a'}, {'h', 'a', 'l', 'a'}};
        System.out.println(f9(arr9, "hil"));






    }
















}
