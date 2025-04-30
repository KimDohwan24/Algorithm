import java.util.ArrayList;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        if(a < b){
            for (int i = a; i <= b; i++) {
                list.add(a++);
            }
        } else {
            for (int i = b; i <= a; i++) {
                list.add(b++);
            }
        }
        
        answer = list.stream().mapToLong(Integer :: intValue).sum();
        
        return (long)answer;
    }
}