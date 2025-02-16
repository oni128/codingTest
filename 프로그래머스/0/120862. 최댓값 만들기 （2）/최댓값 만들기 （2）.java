import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int a = 0;
        int b = 0;
        Arrays.sort(numbers);
        
        a = numbers[numbers.length-1] * numbers[numbers.length-2];
        b = numbers[0] * numbers[1];
        
        return Math.max(a,b);
    }
}