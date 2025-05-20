import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        String re = my_string.replaceAll("[a-z]", "");
        String[] result = re.split("");
        Arrays.sort(result);
        int[] answer = new int[result.length];
        for(int i=0; i<result.length; i++){
            answer[i] = Integer.parseInt(result[i]);
        }
        return answer;
    }
}