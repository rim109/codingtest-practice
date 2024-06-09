class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf(array[0], 0)
        for (i in array.indices)  {
            if (answer[0] < array[i]) {
                answer[0] = array[i]
                answer[1] = i
            }
        }
        return answer
    }
}