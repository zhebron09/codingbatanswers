package warmup1;

public class mixStart {

    public static boolean mixStart(String str) {
        return(str.length() >= 3 && str.substring(1,3).equals("ix"));
    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }
}
