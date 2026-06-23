class Solution {
    public int reverse(int x) {
        String intString = String.valueOf(x);
        StringBuilder builder = new StringBuilder(intString);

        builder.reverse();

        String reversedString = builder.toString();

        try { 
            if (reversedString.contains("-")) {
                String ansStr = reversedString.substring(0, reversedString.length() - 1);
                return (Integer.parseInt(ansStr) * -1);
            } else {
                return Integer.parseInt(reversedString);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
