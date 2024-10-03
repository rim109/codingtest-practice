class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        val orderStr = order.toString()
        
        for (i in 0 until orderStr.length){
            if (orderStr[i] == '3' || orderStr[i] == '6' || orderStr[i] == '9')
            answer++
        }
        return answer
    }
}