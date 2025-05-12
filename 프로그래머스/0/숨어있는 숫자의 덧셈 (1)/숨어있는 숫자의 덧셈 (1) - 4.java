class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        for(char i : my_string.toCharArray()) {
            answer += Character.getNumericValue(i);
        }
        return answer;
    }
}