import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        String re = my_string.replaceAll("[a-z]", "");
        String[] result = re.split("");
        int[] answer = new int[result.length];
        for(int i=0; i<result.length; i++){
            answer[i] = Integer.parseInt(result[i]);
        }
        // answer에서 정렬하기
        Arrays.sort(answer);
        return answer;
    }
}