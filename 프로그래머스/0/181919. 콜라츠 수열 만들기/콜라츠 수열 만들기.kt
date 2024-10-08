class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>().apply { add(n) }
        var num = n

        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2
            } else {
                num = 3 * num + 1
            }
            answer.add(num)
        }

        return answer.toIntArray()
    }
}