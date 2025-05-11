class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] temp = my_string.toCharArray();
        for(char x : temp) {
            if(Character.isDigit(x)){
                answer += x - '0';
            }
        }
        return answer;
    }
}