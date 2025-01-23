class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] a = {5,3,1};
        int last = hp;
        for(int i=0; i<a.length; i++){
            answer += last / a[i];
            last %= a[i];
            
        
        }
        
        return answer;
    }
}