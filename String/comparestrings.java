public class comparestrings{
    public static void main(String[] args) {
        char[] s = {'a','p','p','l','e'};
        String n = new String(s);
        String k = new String(n);
        System.out.println(n);
        System.out.println(k);
        System.out.println(n == k);
    }
}
//false because reference is not same.