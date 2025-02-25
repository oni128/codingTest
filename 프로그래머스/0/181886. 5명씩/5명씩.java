class Solution {
    public String[] solution(String[] names) {
        int size = (names.length + 4) / 5;
        String[] answer = new String[size];
        int j = 0;
        for(int i=0; i<names.length; i++){
         if((i+1) % 5 == 1) {
             answer[j] = names[i];
             j++;
         }
        }
        return answer;
    }

}