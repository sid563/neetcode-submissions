class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        // Arrays.sort(nums);
        
        // int longest = 1;
        // int current = 1;
        // int num =nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==num){
        //          continue;
        //     }else if(nums[i]>num+1){
        //         current=1;
        //         num=nums[i];
        //     }else{
        //         current++;
        //         num=nums[i];
        //         if(current>longest) {
        //             longest=current;
        //         }
        //     }
        // }

        //Optimal Solution
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest = 1;
        for(int num:set){
            if(!set.contains(num-1)){
                int strike = 1;
                while(set.contains(num+strike)){
                    strike++;
                }
                longest=Math.max(strike,longest);
            }
        }


        return longest;
    }
}
