public class StringTest{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "how are you?";
        System.out.println("Length of s1 = " + s1.length());
        System.out.println("Length of s2 = " + s2.length());
        for(int i = 0;i < s1.length();i++){
            System.out.println(i + ": " + s1.charAt(i));

        }
        System.out.println(s2.substring(0,3));
        System.out.println(s2.toUpperCase());
    }


}