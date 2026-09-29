class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i = Arrays.stream(weights).max().getAsInt();
        int j = Arrays.stream(weights).sum();
        while(i<j){
            int mid = i+(j-i)/2;
            if(canShip(weights,days,mid)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
    private static boolean canShip(int[] weights , int days , int c){
        int d=1;
        int load=0;
        for(int w:weights){
            if(load + w > c){
                d++;
                load=0;
            }
            load+=w;
        }
        return d<=days;
    }
}