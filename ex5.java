

import static java.lang.Math.pow;

public class Tester5 {
    public void f5 ( int radius){
        double S = 3.14 * Math.pow(radius, 2);
        double P = 3.14 * radius * 2;
        System.out.println(S);
        System.out.println(P);



    }



    public static void main(String[]args){

        Tester5 test = new Tester5();
        test.f5(14);


    }
}
