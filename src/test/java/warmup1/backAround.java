package warmup1;

public class backAround {

    public static String backAround(String str) {
        int len = str.length();
        String s = str.substring(len - 1);

        str = s + str + s;

        return str;
    }

    public static void main(String[] args) {

        System.out.println(backAround("cat"));
    }
}
