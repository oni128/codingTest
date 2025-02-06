class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int hap = 0;
        if(num_list.length >= 11) {
            for(int i=0; i<num_list.length; i++){
                hap += num_list[i];
            }
            answer = hap;
        }else {
            for(int j=0; j<num_list.length; j++){
                answer *= num_list[j];
            }
        }
        
        return answer;
    }
}