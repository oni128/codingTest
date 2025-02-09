class Solution {
    public String solution(String myString) {
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) != 'A'){
                myString = myString.toLowerCase();
            } 
        }
        myString  = myString.replace("a", "A");
        return myString;
    }
}