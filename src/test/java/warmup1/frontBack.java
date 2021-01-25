package warmup1;

public class frontBack {
    public static String frontBack(String str) {
        if(str.length() < 2){
            return str;
        }  return str.substring(str.length()-1)+ str.substring(1, str.length() - 1) + str.substring(0,1);
    }


    public static void main(String[] args) {

        System.out.println(frontBack("code"));
    }
}

