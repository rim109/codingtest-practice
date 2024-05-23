class Solution {
    fun solution(start: Int, end: Int) = (end..start step 1).toList().sortedDescending()
}