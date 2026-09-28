class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i= 1;
        int j = Arrays.stream(piles).max().getAsInt();
        while (i < j) {
            int mid = i+(j - i)/2;
            if(canEatAll(piles, mid, h)){
                j = mid;
            } 
            else{
                i=mid + 1; 
            }
        }
        return i;
    }
    private boolean canEatAll(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k);
        }
        return hours <= h;
    }
}
