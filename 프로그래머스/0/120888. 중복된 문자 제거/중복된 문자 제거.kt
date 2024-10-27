class Solution {
    fun solution(my_string: String): String {
        var answer = my_string.toList().distinct()
        return answer.joinToString("")
    }
}