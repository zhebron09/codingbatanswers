package warmup1;

public class notString {
        public static String notString(String str) {
            if(str.startsWith("not"))
                return str;
            return "not " + str;
        }

    public static void main(String[] args) {
        System.out.println(notString("candy"));
    }
}

