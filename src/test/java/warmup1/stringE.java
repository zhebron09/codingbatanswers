package warmup1;

public class stringE {

    public static boolean stringE(String str) {

        /*

    Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false

         */

        int result = 0;                             // create empty int variable
        boolean answer = false;                     // create boolean variable default set to false

        for (int i = 0; i < str.length(); i++) {    // start for loop where i stats at 0, and goes through the length of the str, and increments by 1
            if (str.charAt(i) == 'e') {             // if the char of str in the index of i is equal to 'e'
                result++;                           // result is going to add 1...this is your counter each time there is an e detected it adds 1
            }
            if(result >= 1 && result <= 3){         // if the result is greater than or equal to 1 and less than or equal to 3
                answer = true;                      // answer equals true
            } else answer = false;                  // otherwise the answer is false
        }
        return answer;                              // return answer
    }


        public static void main (String[]args){

            System.out.println(stringE("Hello"));       // practice :)
        }
    }

