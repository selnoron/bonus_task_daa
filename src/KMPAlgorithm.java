public class KMPAlgorithm {
    // this method find where pattern is inside text
    public static void search(String text, String pattern) {
        // here we make lps array its like longest prefix suffix
        int[] lps = buildLPS(pattern);
        int i = 0; // pointer for text go right
        int j = 0; // pointer for pattern
        // we walk in text
        while (i < text.length()) {
            // if chars same we just move
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            // if we match full pattern
            if (j == pattern.length()) {
                System.out.println("found at index: " + (i - j));
                j = lps[j - 1]; // go next possible match
            }
            // if chars not same
            else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                // if j not zero we go back a little
                if (j != 0) {
                    j = lps[j - 1];
                }
                // if j zero just move in text
                else {
                    i++;
                }
            }
        }
    }
    // this make lps array for pattern
    // lps tell how much chars match with self kinda
    private static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // len of last longest prefix
        int i = 1;   // start from second char coz first always 0
        // we build lps here slowly
        while (i < pattern.length()) {
            // if chars same we make lps bigger
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                // if not same and len > 0 we try again shorter prefix
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    // if nothing match then 0
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // tests short medium long
    public static void main(String[] args) {
        System.out.println("short test");
        search("abcabc", "abc");
        System.out.println("\nmedium test");
        search("ababcababdabcabab", "abab");
        System.out.println("\nlong test");
        search("aaaaabaaaaabaaaaabaaaaab", "aaaaab");
    }
}
