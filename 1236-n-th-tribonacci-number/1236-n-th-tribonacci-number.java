class Solution {
    public int tribonacci(int n) {
        int[] t = new int[n+3];
        t[0] = 0;
        t[1] = 1;
        t[2] = 1;

        for(int i=3; i<n+3; i++){
            t[i] = t[i-1] + t[i-2] + t[i-3];
        }

        return t[n];
    }
}