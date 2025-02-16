import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                arr.add(todo_list[i]);
            }
        }
        String[] answer = new String[arr.size()];
        for (int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}