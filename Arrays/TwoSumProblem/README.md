# Two Sum

## Problem
Given an integer array and a target,
find two distinct indices whose values add up to the target.

## Approach: Brute Force

1. Use two nested loops.
2. Select the first index using the outer loop.
3. Check subsequent indices using the inner loop.
4. Return the indices when their sum equals the target.

## Complexity Analysis

- Time Complexity: O(n²)
- Auxiliary Space Complexity: O(1)

## Test Cases

- Normal input
- Duplicate values
- No valid pair
- Different index combinations

## Language
Java