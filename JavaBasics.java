class JavaBasics {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        JavaBasics jb = new JavaBasics(); // Create object to call non-static method
        int result = jb.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }

    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}
