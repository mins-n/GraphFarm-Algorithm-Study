https://school.programmers.co.kr/learn/courses/30/lessons/181845
문자열로 변환
Integer.toString(n)



https://school.programmers.co.kr/learn/courses/30/lessons/181910
문자열의 뒤의 n글자
String.length()


https://school.programmers.co.kr/learn/courses/30/lessons/181866
문자열 잘라서 정렬하기
모르겠음




https://school.programmers.co.kr/learn/courses/30/lessons/181905
문자열 뒤집기
문자열은 못 뒤집어서 StringBuffer로 선언해주기
StringBuffer sb = new StringBuffer(sub);
String subRev = sb.reverse().toString();
string에서 문자열 일부 교체
string a = my_string.replace(sub, subRev);



https://school.programmers.co.kr/learn/courses/30/lessons/181849
문자열 정수의 합
char -> int 변환 : char에서 '0'을 빼준다.
'0'을 빼는 이유 : ASCII code에서 '0'은 48의 값을 갖고 있기 때문에


https://school.programmers.co.kr/learn/courses/30/lessons/181864
문자열 바꿔서 찾기
string에서 한 글자 교체
myString.replace('A', 'a')


https://school.programmers.co.kr/learn/courses/30/lessons/181907
문자열의 앞의 n글자
string.substring(a, b);
a는 시작index, b-1이 끝나는 index (인덱스가 a 이상 b 미만인 문자열을 리턴)


https://school.programmers.co.kr/learn/courses/30/lessons/181945?language=java
문자열 돌리기



https://school.programmers.co.kr/learn/courses/30/lessons/181915
글자 이어 붙여 문자열 만들기
배열을 초기화할 때는 중괄호 사용
int[] index_list = {1, 2, 0, 0, 3};
String에서 문자열 붙일 때 + 사용

https://school.programmers.co.kr/learn/courses/30/lessons/181911
부분 문자열 이어 붙여 문자열 만들기


https://school.programmers.co.kr/learn/courses/30/lessons/181875
배열에서 문자열 대소문자 변환하기

https://school.programmers.co.kr/learn/courses/30/lessons/181842
부분 문자열

https://school.programmers.co.kr/learn/courses/30/lessons/181841
꼬리 문자열

https://school.programmers.co.kr/learn/courses/30/lessons/181878
원하는 문자열 찾기


https://school.programmers.co.kr/learn/courses/30/lessons/181848
문자열을 정수로 변환하기
int answer = Integer.parseInt(n_str);

https://school.programmers.co.kr/learn/courses/30/lessons/181952
문자열 출력하기

https://school.programmers.co.kr/learn/courses/30/lessons/181950
문자열 반복해서 출력하기


https://school.programmers.co.kr/learn/courses/30/lessons/181872
특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

모르겠음 제외 17개


https://school.programmers.co.kr/learn/courses/30/lessons/181871
문자열이 몇 번 등장하는지 세기
class Solution {
public int solution(String myString, String pat) {
int count = 0;
for(int i=0; i<myString.length(); i++) {
if(myString.charAt(i) == pat.charAt(0) && myString.substring(i).contains(pat) ) {
count++;
}
}
return count;
}
}
왜 틀리지? 반례를 생각하지 못하겠다.


https://school.programmers.co.kr/learn/courses/30/lessons/181855
문자열 묶기
다른 사람 풀이 봐도 모르겠다.


https://school.programmers.co.kr/learn/courses/30/lessons/181913
문자열 여러 번 뒤집기
strr.replace(sub, cng) 메서드는 strr에서 sub과 일치하는 모든 부분을 cng로 바꾼다. 일치하는 모든 부분이 아니라 특정 부분만 바꾸고 싶다면 주의!