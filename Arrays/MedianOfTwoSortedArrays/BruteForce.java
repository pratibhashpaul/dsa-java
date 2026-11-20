package Arrays.MedianOfTwoSortedArrays;

class BruteForce {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] array = new int[m + n];

        int i, j;

        // Copy elements of nums1
        for (i = 0; i < m; i++) {
            array[i] = nums1[i];
        }

        // Copy elements of nums2
        for (j = 0; j < n; j++) {
            array[m + j] = nums2[j];
        }

        // Sort the combined array
        for (i = 0; i < m + n; i++) {
            int t = 0;

            for (j = i + 1; j < m + n; j++) {
                if (array[i] > array[j]) {
                    t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }

        // Calculate median
        double median;

        if ((m + n) % 2 == 0) {
            median = (array[(m + n) / 2] + array[(m + n) / 2 - 1]) / 2.0;
            return median;
        } else {
            median = array[(m + n) / 2];
            return median;
        }
    }
}
