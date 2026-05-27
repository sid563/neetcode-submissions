class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        
        int longest = 1;
        int current = 1;
        int num =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num){
                 continue;
            }else if(nums[i]>num+1){
                current=1;
                num=nums[i];
            }else{
                current++;
                num=nums[i];
                if(current>longest) {
                    longest=current;
                }
            }
        }
        return longest;
    }
}
