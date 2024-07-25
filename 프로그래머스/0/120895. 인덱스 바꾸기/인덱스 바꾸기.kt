class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val answer = my_string.toCharArray()
        val str = answer[num1]
        answer[num1] = answer[num2]
        answer[num2] = str
        
        return answer.joinToString("")
    }
}