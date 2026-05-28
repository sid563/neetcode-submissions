class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        if (len<2) return new int[]{};
        // for(int i=0;i<len;i++){
        //   int current=numbers[i];
        //   int search=target-current;
        //   int left=i+1;
        //   int right=len-1;
        //   while(left<=right){
        //     int mid=left+(int)(right-left)/2;
        //     if(numbers[mid]==search){
        //       return new int[]{i+1,mid+1};
        //     }else if(numbers[mid]>search){
        //       right=mid-1;
        //     }else{
        //       left=mid+1;
        //     }
        //   }
        // }

        //Since array is sorted, 2 pointer method time complexity will be O(n)


        int left = 0;
        int right = len-1;

        while(left<right){
          int sum = numbers[left]+numbers[right];
          if(sum==target){
            return new int[]{left+1,right+1};  
          }else if(sum<target) {
            left++;
          }else{
            right--;
          }
        }
        return new int[]{};
    }
}
