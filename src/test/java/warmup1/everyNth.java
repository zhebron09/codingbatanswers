package warmup1;

public class everyNth {

    /*

    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the
    string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"

    */

    public static String everyNth(String str, int n) {

        String result = "";                               // initiating String result variable by assigning it empty

        for(int i = 0; i < str.length(); i = i +n){       // this loop starts at position 0, goes the full length of the str
                                                          // then it moves forward in iterations of i(which starts at 0) + the value of n
            result += str.charAt(i);                      // result is a concatenation of the chars in the position at i(^^^)
        }
        return result;                                    // return the version of str now named result

    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));       // practice :)

    }
}
