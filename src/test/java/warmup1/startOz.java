package warmup1;

public class startOz {

    public static String startOz(String str) {
        String result = "";


        if(str.length() >=1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0); }

        if(str.length() >=2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
    }
}