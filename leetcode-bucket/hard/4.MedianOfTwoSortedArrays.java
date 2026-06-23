class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int mergedArrLen = nums1Len + nums2Len;
        int[] mergedArr = new int[mergedArrLen];
        int i = 0;
        int j = 0;
        int pointer = 0;

        while (i < nums1Len && j < nums2Len) {
            if (nums1[i] <= nums2[j]) {
                mergedArr[pointer] = nums1[i];
                i++;
                pointer++;
            }
            else {
                mergedArr[pointer] = nums2[j];
                j++;
                pointer++;
            }
        }

        while (i < nums1Len) {
            mergedArr[pointer] = nums1[i];
            i++;
            pointer++;
        }

        while (j < nums2Len) {
            mergedArr[pointer] = nums2[j];
            j++;
            pointer++;
        }

        int mid1 = 0;

        if (mergedArrLen > 1) {
            mid1 = mergedArr[(mergedArrLen / 2) - 1];
        }
        else {
            mid1 = mergedArr[(mergedArrLen / 2)];
        }
        int mid2 = mergedArr[(mergedArrLen / 2)];

        if (mergedArrLen % 2 != 0) {
            return mergedArr[mergedArrLen / 2];
        }

        return (mid1 + mid2) / 2.0;
    }
}
