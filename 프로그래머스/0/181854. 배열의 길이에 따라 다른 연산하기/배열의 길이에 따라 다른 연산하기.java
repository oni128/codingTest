class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if(arr.length % 2 != 0){
            for(int i=0; i<arr.length; i+=2){
                arr[i] += n;
            }
        }else if(arr.length % 2 == 0){
            for(int i=1; i<arr.length; i+=2){
                arr[i] += n;
            }
        }
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}