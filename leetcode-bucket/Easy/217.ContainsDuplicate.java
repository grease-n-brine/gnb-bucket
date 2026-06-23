class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numArr = new HashSet<>();

        for (int element: nums) {
            if (!numArr.add(element)) {
                return true;
            }
        }
        return false;
    }
}
