class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(len==0) return new int[]{};
        int[] result = new int[len];

        int zeroCount=0;
        int index=0;
        int product = 1;
        for(int i=0;i<len;i++){
          if(nums[i]==0){
            index=i;
            zeroCount++;
            if(zeroCount>1){
              return result;
            }
            continue;
          }
          product*=nums[i];

        }

        if(zeroCount==1){
          result[index]=product;
          return result;
        }
        for(int i=0;i<len;i++){
          result[i]=product/nums[i];
        }
        return result;
    }
}  
