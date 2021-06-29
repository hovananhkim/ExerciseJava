package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Array01 {
    public String numberRepeatAppear(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            String num = Integer.toString(nums[i]);
            if (lastIndexOf(nums, nums[i]) > i && !result.contains(num)) {
                result.add(num);
            }
        }
        return String.join(" ", result);
    }

    public int lastIndexOf(int[] nums, int number) {
        for (int i = nums.length - 1;true; i--) {
            if (number == nums[i]) {
                return i;
            }
        }
    }
}
