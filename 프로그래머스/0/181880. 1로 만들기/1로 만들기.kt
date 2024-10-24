class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        for (i in num_list) {
            var a = i
            while (a > 1) {
                if (a % 2 == 0) {
                    a /= 2
                } else {
                    a = (a - 1) / 2
                }
                answer++
            }
        }
        return answer
    }
}