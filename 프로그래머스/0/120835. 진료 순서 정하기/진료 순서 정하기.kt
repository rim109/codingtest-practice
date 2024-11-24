class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer = IntArray(emergency.size)
        for (i in emergency.indices){
            for ( j in emergency.indices)
            if (emergency[i] < emergency[j]){
                answer[i]++ 
            }
            answer[i]++
        }
        return answer
    }
}