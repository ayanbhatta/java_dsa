package DSA;

public class palindrome {
    public static void main(String[] args) {
        //StringBuilder builder = new StringBuilder("abbac");
        //System.out.println(builder.reverse());

        String n="abcdcba";
        System.out.println(isPalindrome(n));

        }
    public static boolean isPalindrome(String n){
        for (int i = 0; i < n.length()/2; i++) {
            char start = n.charAt(i);
            char end = n.charAt(n.length()-1-i);
            if(start != end){
               return false;
            }
        }return true;
    }

}
