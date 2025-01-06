class Solution {
    fun solution(strArr: Array<String>): Int {
        return strArr.groupBy { it.length }.maxOf { it.value.size }
        // groupBy로 묶고 가장 개수가 많은 그룹을 리턴하면 됨.
    }
}