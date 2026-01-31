public class leetcode2315 {
    public static void main(String[] args) {
        String s = "l|***ads|wsda|**";
        System.out.println(countAsterisks(s));
    }

    static int countAsterisks(String s) {
        int count = 0;
        boolean inside = false;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                inside = !inside;  // Toggle inside/outside sections
            } else if (!inside && c == '*') {
                count++;          // Count only stars OUTSIDE bars
            }
        }
        return count;
    }
}

