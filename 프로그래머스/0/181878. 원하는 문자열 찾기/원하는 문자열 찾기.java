class Solution {
    public int solution(String myString, String pat) {
       int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        for(int i=0; i<myString.length(); i++){
            if(myString.contains(pat)) answer = 1;
            else answer = 0;
        }
        return answer;
    }
}