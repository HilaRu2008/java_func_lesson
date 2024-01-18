public class Tester4 {

    public int f4 (int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
        int avg = (num1 + num2 + num3)/3;
        return avg;



    }



    public static void main(String[]args){

        Tester4 test = new Tester4();
        System.out.println(test.f4(1,2,3));


    }


}
