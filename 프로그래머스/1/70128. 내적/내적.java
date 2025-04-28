class Solution {
    public int solution(int[] a, int[] b) {
        int[] arr = new int[a.length];
        int result = 0;
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
            result = 0;
            result = result + (a[i] * b[i]);
            arr[i] = result;
            answer += arr[i];
        }
        return answer;
    }
}