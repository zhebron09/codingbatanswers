package warmup1;

public class endUp {

    public static String endUp(String str) {

        if(str.length() >=3)
            return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
        if (str.length()<3)
            return(str.toUpperCase());
        else return str;
    }


    public static void main(String[] args) {

        System.out.println(endUp("Hello"));
    }
}

