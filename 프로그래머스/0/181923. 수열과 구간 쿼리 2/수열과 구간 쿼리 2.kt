class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()

        for (q in queries) {
            val s = q[0]
            val e = q[1]
            val k = q[2]
            var f = -1

            for (j in s..e) {
                if (arr[j] > k) {
                    if (f == -1 || arr[j] < f) {
                        f = arr[j] 
                    }
                }
            }
            answer.add(f)
        }

        return answer.toIntArray()
    }
}