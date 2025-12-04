public class SubstringSearch {
    public static void main(String[] args) {
        String str = "abcdacbacabcdbcdabca";
        String target = "abc";

        int n = str.length();
        int m = target.length();

        for (int i = 0; i <= n - m; i++) {  // <= to include last possible position
            int j = 0;
            while (j < m && str.charAt(i + j) == target.charAt(j)) {
                j++;
            }
            if (j == m) {  // if full target matched
                System.out.println("Found at index: " + i);
            }
        }
    }
}
