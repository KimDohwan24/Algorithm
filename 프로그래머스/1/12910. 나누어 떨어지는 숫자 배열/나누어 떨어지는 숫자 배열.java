import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : arr){
            if(num % divisor == 0){
                answer.add(num);
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }
        Collections.sort(answer);
        return answer;
    }
}