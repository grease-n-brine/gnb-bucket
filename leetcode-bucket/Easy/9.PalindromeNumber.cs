public class Solution {
    public bool IsPalindrome(int x) {
        String potPalindrome = x.ToString();
        int pointerEnd = potPalindrome.Length - 1;

        for (int pointerStart = 0; pointerStart <= potPalindrome.Length/2; pointerStart++) {
            if (potPalindrome[pointerStart].Equals(potPalindrome[pointerEnd - pointerStart])) {
                continue;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
