package string3;

public class withoutString {

    /*

    Given two strings, base and remove, return a version of the base string where all instances of the remove string
    have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only
     non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"

     */

    public static String withoutString(String base, String remove) {

        String result = "";
        int bLen = base.length();
        int rLen = remove.length();

        for(int i = 0; i < bLen-rLen; i++){
            result += base.charAt(i);
            if(base.substring(i, i + rLen).equals(remove)){
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));

    }


}
