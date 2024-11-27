class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        var bool: Boolean

        do {
            bool = false
            for (i in arr.indices) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2
                    bool = true
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1
                    bool = true
                }
            }
            answer++
        } while (bool)

        return answer - 1
    }
}