class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        myString.map {
            answer += it.uppercase()
        }
        return answer
    }
}