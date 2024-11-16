class Solution {
    fun solution(before: String, after: String): Int {
        
        val beforeCount = before.groupingBy { it }.eachCount()
        val afterCount = after.groupingBy { it }.eachCount()
        
        return if (beforeCount == afterCount) {
            1
        } else {
            0
        }
    }
}