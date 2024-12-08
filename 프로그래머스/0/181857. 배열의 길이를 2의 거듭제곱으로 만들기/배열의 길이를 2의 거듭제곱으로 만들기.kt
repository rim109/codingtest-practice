import kotlin.math.pow

class Solution {
    fun solution(arr: IntArray): IntArray {
        var size = arr.size
        var pows = 0
        
        while (size > 2.0.pow(pows)){
            pows++
        }
        
        val answer = IntArray(2.0.pow(pows).toInt())
        
        for(i in arr.indices){
            answer[i] = arr[i]
        }
        return answer
    }
}
