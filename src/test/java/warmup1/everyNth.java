package warmup1;

public class everyNth {

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
