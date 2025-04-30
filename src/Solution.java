public class Solution {

    public int findNumbers(int[] nums) {
        int num=0,c=0,cEven=0;
        for(int i=0;i<nums.length;i++) {
        num=nums[i];
        while(num>0){
            num=num/10;
            c++;
            }
        if(c%2==0){
            cEven++;
        }
        c=0;
        }
        if(cEven!=0){
        return cEven;
        } else return -1;
    }
}
