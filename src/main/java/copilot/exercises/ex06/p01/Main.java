package copilot.exercises.ex06.p01;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromeChecker("level")); // true
        
    }

    public static boolean palindromeChecker(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}