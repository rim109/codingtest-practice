class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr.indices){
            for (j in 0..arr[i]-1){
                answer += arr[i]
            }
        }
        return answer
    }
}