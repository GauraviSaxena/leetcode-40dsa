class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n=hours.length;
        int count=0;
        // for(int i=0;i<n;i++){
        //     if( hours[i]>=target){
            for(int h : hours){
    if(h >= target){
            count++; 
            }
        }
        return count;
    }
}