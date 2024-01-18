public class Tester11 {

    public static boolean f11(int len, String text){

        if (text.length() == len)
            return true;
        else
            return false;

    }

    public static void main(String[]args){
        System.out.println(f11(3, "hell"));

    }
}
