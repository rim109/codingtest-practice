class Solution {
    fun solution(s: String): String {
        var sort = s.toList().sortedDescending()
        return sort.joinToString("")
    }
}