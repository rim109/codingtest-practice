class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var size = included.size 
        for (i in 0 until size){
            var temp = a + d * i
            if (included[i] == true)
            answer += temp
        }
        return answer
    }
}