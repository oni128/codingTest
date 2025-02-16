class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int j=0;
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[j] = strArr[i];
                j++;
            }
        }
        String[] answer2 = new String[j];
        for(int k=0; k<answer2.length; k++){
            answer2[k] = answer[k];
        }
        return answer2;
    }
}