class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for (i in arr){
            if (i % divisor == 0){
                answer += i
            }
        }
        return if(answer.isEmpty()){
            intArrayOf(-1)
        } else {
            answer.sorted().toIntArray()
        }
    }
}