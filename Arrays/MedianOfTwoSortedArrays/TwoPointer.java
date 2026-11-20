package Arrays.MedianOfTwoSortedArrays;

public class TwoPointer {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // declaring two variables to store the length of the array
        int m = nums1.length;
        int n = nums2.length;
        // declaring another merged array
        int[] array = new int[m + n];
        int i = 0, j = 0, k = 0;
        // transferring the numbers into the new array
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                array[k] = nums1[i];
                i++;
            } else {
                array[k] = nums2[j];
                j++;
            }
            k++;
        }
        // getting the rest of the elements
        while (i < m) {
            array[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            array[k] = nums2[j];
            j++;
            k++;
        }
        // finding the median
        double median;
        if ((m + n) % 2 == 0) {
            median = ((double) array[(m + n) / 2] + array[((m + n) / 2 - 1)]) / 2.0;
            return median;
        } else {
            median = array[(m + n) / 2];
            return median;
        }

    }

}
