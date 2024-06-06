class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer = myString.replace("A","X").replace("B","A").replace("X","B")
        return if (answer.contains(pat)) 1 else 0
    }
}