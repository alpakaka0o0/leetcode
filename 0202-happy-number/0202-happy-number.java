class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        while (temp > 4){
            int nextTemp = 0;
            while (temp > 0){
                int d = temp % 10;
                nextTemp += d*d;
                temp /= 10;
            }
            temp = nextTemp;
        }
        if (temp == 1){
            return true;
        }
        return false;
    }
}