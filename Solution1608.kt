class Solution1608 {
    fun specialArray(nums: IntArray): Int {
        for (i in 0..nums.size) {
            var temp = 0
            for (j in nums.indices) {
                if (nums[j] >= i) temp++
            }
            if (temp == i) return i
        }
        return -1
    }
}