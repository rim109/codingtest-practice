class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        val minimum = arr.minOrNull()
        var size = arr.size
        
        if (arr.size <= 1) answer = intArrayOf(-1)
        else answer = arr.filterNot {it == minimum}.toIntArray()
        return answer
    }
}