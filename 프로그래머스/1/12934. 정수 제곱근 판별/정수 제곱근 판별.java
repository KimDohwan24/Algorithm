class Solution {
    public long solution(long n) {
        double answer = Math.sqrt(n);
        
        if(answer % 1 == 0){
            answer = (long) Math.pow(answer+1,2);
        } else answer = -1;
        
        return (long)answer;
    }
}