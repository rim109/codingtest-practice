class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for (i in 0 until absolutes.size){
            answer += if (signs[i]) absolutes[i] else -absolutes[i]
        }
        return answer
    }
}