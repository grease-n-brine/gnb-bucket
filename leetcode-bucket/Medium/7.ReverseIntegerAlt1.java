class Solution {
    public int reverse(int x) {
        int reversed = 0;

        try {
            while (x != 0) {
                int digit = x % 10;
                x = x / 10;

                if (reversed > Integer.MAX_VALUE / 10 ||
                    reversed < Integer.MIN_VALUE / 10) {
                        throw new Exception("Out of bounds error");
                    }

                reversed = (reversed * 10) + digit;
            }
        } catch (Exception e) {
            e.printStackTrace();

            return 0;
        }

        return reversed;
    }
}
