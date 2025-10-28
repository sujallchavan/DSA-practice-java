package recusion;

public class isPalindrome {

    public boolean isPalindrome1(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return isPalindrome1(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        isPalindrome ob = new isPalindrome();

        String s = "madam";
        boolean result = ob.isPalindrome1(s, 0, s.length() - 1);

        System.out.println("Is '" + s + "' palindrome? " + result);
    }
}
