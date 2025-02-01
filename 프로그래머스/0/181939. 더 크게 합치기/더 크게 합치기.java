class Solution {
    public int solution(int a, int b) {
        String one = "" + a + b ;
        String two = "" + b + a ;
        return Math.max(Integer.parseInt(one), Integer.parseInt(two));
    }
}