package warmup1;

public class backAround {

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
