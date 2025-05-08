import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        String re = my_string.replaceAll("[a-z]", "");
        String[] result = re.split("");
        Arrays.sort(result);
        int[] answer = new int[result.length];
        int i=0;
        // for each문 이용
        for (String c : result) {
            answer[i] = Integer.parseInt(c) ;
            i++;
        }
        return answer;
    }
}