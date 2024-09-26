class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 1
        for (i in box){
            answer *= ( i / n )
        }
        return answer
    }
}