class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char x : my_string.toCharArray()) {
            if(Character.isDigit(x)){
                answer += x - '0';
            }
        }
        return answer;
    }
}