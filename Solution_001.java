import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 */
public class Solution_001 {

    public static void main(String[] args) {
        Solution_001 solution = new Solution_001();
        int[] result = solution.twoSum(new int[]{2,7,11,15}, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++) {
            if (resultMap.containsKey(target - nums[i])) {
                result[0] = resultMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            resultMap.put(nums[i], i);
        }
        return result;
    }
}
