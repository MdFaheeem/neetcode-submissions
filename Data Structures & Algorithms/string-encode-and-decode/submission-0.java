class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length())
                   .append("#")
                   .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(str.substring(i, j));

            // Move after '#'
            j++;

            // Extract the actual string
            String s = str.substring(j, j + length);

            result.add(s);

            // Move to next encoded string
            i = j + length;
        }

        return result;

    }
}
