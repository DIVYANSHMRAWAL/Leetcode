//QUESTION-->
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//ANSWER-->
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
   Arrays.sort(nums);
   for(int i=0;i<nums.length-2;i++){
    if(i>0 && nums[i]==nums[i-1]){
        continue;
    }
    int left=i+1;
    int right=nums.length-1;

while (left<right){
    if((nums[i]+nums[left]+nums[right])==0){
result.add(Arrays.asList(nums[i],nums[left],nums[right]));
    
while (left<right && nums[left] == nums[left+1]){
    left++;
}
while (left<right && nums[right] == nums[right-1]){
    right--;
}
left++;
right--;
    }
    else if((nums[i]+nums[left]+nums[right])<0){
   left++;
   }
   else {
    right--;
   }
   }
    }
    return result;
    }
}
