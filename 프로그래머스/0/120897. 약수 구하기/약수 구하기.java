import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                arr.add(i);
                if(i != n/i){
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        int[] answer = new int[arr.size()];
        for (int i=0; i<arr.size(); i++){
            //if(!answer.contains(arr.get(i)))
                answer[i] = arr.get(i);
        }
        return answer;
    }
}