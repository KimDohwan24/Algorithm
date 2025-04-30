import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for(String s : arr){
            stringBuilder.append(s);
        }
        return Long.parseLong(stringBuilder.toString());
    }
}