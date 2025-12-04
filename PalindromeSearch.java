public class PalindromeSearch {

    // Function to check if a string is palindrome
    public static boolean pal(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "ababadabacabddabacabaabcdabc";
        String temp = "";  // to store longest palindrome

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);  // generate substring

                if (pal(sub) && sub.length() > temp.length()) {
                    temp = sub;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + temp);
        System.out.println("Length: " + temp.length());
    }
}
