import java.util.HashMap;

public class Q1_twoSum {
    //两数之和
    //暴力法
    public int[] twoSum(int[] nums, int target) {
        int count = nums.length;
        for(int i = count - 1;i>=0;i--){
            int need = target - nums[i];
            for(int j = 0;j <= i-1;j++){
                if(nums[j]==need){
                    return new int[]{j,i};
                }
            }
        }
        return null;
    }
    //一边哈希表
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> tempMap= new HashMap<Integer, Integer>();
        for(int i = 0;i <= nums.length - 1;i++){
            Integer location = tempMap.get(nums[i]);
            if(location != null && location != i){
                return new int[]{location,i};
            }else{
                Integer need = target - nums[i];
                tempMap.put(need,i);
            }
        }
        return null;
    }

}
