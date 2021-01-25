package warmup1;

public class missingChar {
    public static String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1);
    }


    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
    }
}

