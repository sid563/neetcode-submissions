class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        if (len<3) return list;
        Arrays.sort(nums);
        for(int i:nums){
        System.out.println(i);
        }
        for(int i=0;i<len-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;  //important, here we 
          int target=-nums[i];
          int left  =i+1;
          int right = len-1;
          while(right>left){
            int sum=nums[left]+nums[right];
            if(sum==target){
                List<Integer> intArray= new ArrayList<>();
                intArray.add(nums[i]);
                intArray.add(nums[left]);
                intArray.add(nums[right]);
                list.add(intArray);

                left++;
                right--;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right+1]){
                    right--;;
                }
            }
            else if(sum>target){
              right--;
            }else{
              left++;
            }
          }
        
        }
        return list;
      }
}
