<code>
    import java.util.*;

    class Solution {
    public int[] solution(String my_string) {
    
            String re = my_string.replaceAll("[a-z]", "");
            // char[] result = re.toCharArray();
            String[] result = re.split("");
            Arrays.sort(result);
            int[] answer = new int[result.length];
            int i=0;
            for (String c : result) {
                answer[i] = Integer.parseInt(c) ; 
                i++;
            }
            // for(int i=0; i<result.length; i++){
            //     answer[i] = Integer.parseInt(result[i]);
            // }
            // Arrays.sort(answer);
            return answer;
        }
    }
</code>

위의 코드에서 알게된 점
- char[] result = re.toCharArray(); 
  - 문자열을 문자(char)타입의 배열로 변환.
- Integer.parseInt(c) 
  - `문자열 c`를 정수형(Int)타입으로 변환.
  - 반드시 `정수 형태의 문자열`이어야함.
  - <code>String c = "123";
    int num = Integer.parseInt(c);</code>
  - 만약 char 타입 숫자 하나를 정수로 변환하고 싶다면
    - <code>char ch = '7'; int num = ch - '0';  // num = 7 </code>

<br>

다음 시간에 알아봐야 할 함수
- String.valueOf()
- Character.toString()!
- [스크린샷 2025-05-20 23.57.14.png](../../../../../../../var/folders/m2/7tz89sg96jv7_35zccgvptbr0000gn/T/TemporaryItems/NSIRD_screencaptureui_sIPrgM/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-20%2023.57.14.png)