class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] op = new int [n];
        int leftProduct = 1;
        for(int i = 0; i<n ; i++){
            op[i] = leftProduct;
            leftProduct*=nums[i];
        }
        int rightProd =1;
        for(int i = n-1;i>=0;i--){
            op[i]*=rightProd;
            rightProd*=nums[i];
        }
        return op;
    }
}