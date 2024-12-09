class Solution {
    fun solution(myString: String, pat: String): String {
        var answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length)
        return answer
    }
}