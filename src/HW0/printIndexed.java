package HW0;

public class printIndexed {
    public static void printIndexed(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            output.append(s.charAt(i));
            output.append(s.length()-1-i);
        }
        System.out.println(output.toString());
    }
}
