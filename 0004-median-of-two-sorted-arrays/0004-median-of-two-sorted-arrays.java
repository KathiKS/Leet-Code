class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        int i = 0, j = 0;

        int prev = 0, curr = 0;

        for (int count = 0; count <= n / 2; count++) {

            prev = curr;

            if (i < nums1.length &&
                (j >= nums2.length || nums1[i] <= nums2[j])) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }
        }

        if (n % 2 == 1)
            return curr;

        return (prev + curr) / 2.0;
    }
}