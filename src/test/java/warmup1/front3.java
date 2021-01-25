package warmup1;

public class front3 {
    public static String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        String newStr = str.substring(0, 3);
        return newStr + newStr + newStr;
    }

    public static void main(String[] args) {
        System.out.println(front3("Chocolate"));
    }
}

