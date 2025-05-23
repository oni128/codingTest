알게된 점
- Character.isDigit(char c)
  - static 메서드여서 character 클래스에서 직접 호출
<code>
  - Character.isDigit('3');    // true
  - Character.isDigit('a');    // false
  - Character.isDigit("3");    // ❌ 오류 (String은 안 됨)
</code>
- toCharArray() 
  - String 클래스의 인스턴스 메서드
  - <code>String str = "abc123"; 
  - char[] arr = str.toCharArray();  // ['a', 'b', 'c', '1', '2', '3']</code>
- bufferedWriter
    - bw.write(문자열)
        - bw.write(String.valueOf(97)) -> 문자열 "97" 출력
        - bw.write((int)'a') -> 내부적으로 write(97) 과 동일
    - bw.write(int형)  - ascii로 변환
        - bw.write(97) -> 'a' 출력
- Character.getNumericValue(char c)
  - 문자 ch가 나타내는 값을 정수(int)로 반환하는 메서드
  - Character.getNumericValue('3');  // 출력: 3
    Character.getNumericValue('A');  // 출력: 10
    Character.getNumericValue('f');  // 출력: 15
    Character.getNumericValue('가'); // 출력: -1
