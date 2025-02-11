class Solution {
    public int solution(int n) {
        int a = 6;
        int count = 1;
        while(a % n != 0){
            a += 6;
            count++;
       }
     return count ;   
    }
}