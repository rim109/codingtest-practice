class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in arr){
            if (k % 2 == 1){
                answer += k*i
            } else {
                answer += k+i
            }       
        }
        return answer.toIntArray()
    }
}