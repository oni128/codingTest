class Solution {
    public int solution(String my_string, String is_prefix) {
        int length = is_prefix.length();
        int result = 0;
        if(my_string.length() < length) return 0;
        for(int i=0; i<length; i++){
            if(my_string.charAt(i) == is_prefix.charAt(i)) {
                result = 1; 
            }else {
                result = 0;
                break;
            }
        }
        return result;
    }
}