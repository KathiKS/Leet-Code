/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n < 2) {
            return 1;
        }

        int left = 1;
        int right = n;

        while (left < right) {
            int bad = left + (right - left) / 2;
            if (isBadVersion(bad)) {
                right = bad;
            } else {
                left = bad + 1;
            }
        }

        return left;
    }
}