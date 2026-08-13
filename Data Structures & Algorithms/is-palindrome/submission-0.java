class Solution {
    public boolean isPalindrome(String s) {
        String str= s.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();
        int leftPointer = 0;
        int rightPointer = str.length()-1;

        while(leftPointer<rightPointer){
            if(str.charAt(leftPointer) == str.charAt(rightPointer)){
                leftPointer++;
                rightPointer--;
            }
            else
                return false;
        }
        return true;
    }
}
