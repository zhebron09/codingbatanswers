package warmup1;

public class front3 {

    /*

    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less
    than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"

    */

    public static String front3(String str) {

        if (str.length() <= 3) {
            return str + str + str;
        }
        String newStr = str.substring(0, 3);
        return newStr + newStr + newStr;
    }

    public static void main(String[] args) {
        System.out.println(front3("Chocolate"));
    }
}

