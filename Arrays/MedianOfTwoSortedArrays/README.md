# Median of Two Sorted Arrays

## Approach 1: Brute Force (Sorting)

1. Create a new array of size m+n.
2. Copy elements from both input arrays.
3. Sort the combined array using nested loops.
4. Calculate the median based on whether the total length is even or odd.

## Complexity Analysis

- Time Complexity: O((m+n)^2)
- Auxiliary Space Complexity: O(m+n)

## Language
Java