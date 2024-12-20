class Solution {
    // 해당되는 인덱스 있는 값이랑 그 마지막에 있는 인덱스 값이랑 동일하다면 하나만 있는 것이고
    // 다르다면 여러 개 있다는 뜻이다. 그래서 동일한 것만 리스트하고 정렬해주고 joinToString 해주면 답이 나온다.
    fun solution(s: String): String = s.filter { s.indexOf(it) == s.lastIndexOf(it)}.toList().sorted().joinToString("")
}