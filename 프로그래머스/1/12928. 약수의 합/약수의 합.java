import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i =1; i<= n; i++){
            if(n % i == 0){
                arr.add(i);
            }
        }

        for(int i = 0; i<arr.size();i++){
            answer += arr.get(i);
        }
        
        return answer;
    }
}