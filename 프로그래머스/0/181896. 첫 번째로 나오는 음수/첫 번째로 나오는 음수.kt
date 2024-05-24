class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        for (i in num_list.indices){
            if (num_list[i] < 0 ) {
                answer = i
                break
            }else {
                answer = -1
            }
        }
        return answer
    }
}