class Solution {
    fun solution(my_string: String, n: Int): String {
        val answer = my_string.map{it.toString().repeat(n)}
        .joinToString("")
        return answer
    }
}