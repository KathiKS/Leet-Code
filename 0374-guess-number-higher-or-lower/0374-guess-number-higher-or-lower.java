public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int beg = 1, end = n;
        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == 1) beg = mid + 1;
            else end = mid - 1;
        }
        return 0;
    }
}