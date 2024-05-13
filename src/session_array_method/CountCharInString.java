package session_array_method;

public class CountCharInString {
    public static void main(String[] args) {
        String s = "Hello";
        char c = 'l';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("Char '"+ c + "' appear " + count + " times." );
    }
}
