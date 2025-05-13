class Solution {
    public int solution(int n) {
        StringBuffer str = new StringBuffer(Integer.toString(n,3));
        String reverseStr = str.reverse().toString();
        
        return Integer.parseInt(reverseStr,3);
    }
}