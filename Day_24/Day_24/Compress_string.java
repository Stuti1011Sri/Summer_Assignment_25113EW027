
class StringCompression {
    static String compress(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            // If next char is same, increase count
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Append current char and its count
                result.append(s.charAt(i)).append(count);
                count = 1; // reset count
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbcddd")); // a3b2c1d3
        System.out.println(compress("abcd"));      // a1b1c1d1
    }
}