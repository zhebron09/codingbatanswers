package warmup1;

public class delDel {

    public static String delDel(String str) {

        if(str.length() >= 4 && str.substring(1,4).equals("del")){   // if the length of the str is greater than or equal to 4( b.c. "del" is 3 chars and starts at index 1)
                                                                     // so it takes up 4 indexes AND substring starting at index 1 to 4 is equal to "del"
            return str.substring(0,1) + str.substring(4);            // return substring(0,1) which is the first char and add that to substring(4) which will start
             } else {                                                // at position 4 and go through the length of the string which omits the "del"
            return str;                                              // other wise we are just returning the str in it's original format
        }
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));         // practice :)
    }
}

