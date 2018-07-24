package SegmentTree;

/**
 * @ Description: LeetCode 307
 * @ Date: Created in 22:10 21/07/2018
 * @ Author: Anthony_Duan
 */
public class NumArray {


    private SegmentTree<Integer> segmentTree;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            Integer[] data = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                data[i] = nums[i];
            }
            segmentTree = new SegmentTree<Integer>(data, (a, b) -> a + b);
        }
    }

    public int sumRange(int i, int j) {

        if (segmentTree == null) {
            throw new IllegalArgumentException("Segment Tree is null");
        }

        return segmentTree.query(i, j);
    }
}
