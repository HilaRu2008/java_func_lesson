public class Tester10 {

    public static String f10 (String text1, String text2){

        if (text1.compareTo(text2) < 0)  // if text 1 is bigger
            return  text1;
        else
            return text2;

    }

    public static void main(String[]args){

        System.out.println(f10("hila", "hello"));

    }
}
