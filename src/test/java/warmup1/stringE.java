package warmup1;

public class stringE {

    public static boolean stringE(String str) {

        int result = 0;
        boolean answer = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result++;
            }
            if(result >= 1 && result <= 3){
                answer = true;
            } else answer = false;
        }
        return answer;
    }


        public static void main (String[]args){

            System.out.println(stringE("Hello"));
        }
    }

