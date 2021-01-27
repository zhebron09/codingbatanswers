package warmup1;

public class backAround {

    /*

    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
    The original string will be length 1 or more.

    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"

     */

    public static String backAround(String str) {

        int len = str.length();              // assigning str length as an int variable

        String s = str.substring(len - 1);   // creating a new String s to represent the last char in the String

        str = s + str + s;                   // reassigning what str is...now str is s(last char) + str(original) + s(last char)

        return str;                          // return the new str
    }

    public static void main(String[] args) {

        System.out.println(backAround("cat"));         // practice :)
    }
}
