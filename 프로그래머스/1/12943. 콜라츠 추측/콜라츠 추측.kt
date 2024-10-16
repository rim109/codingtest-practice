class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num.toLong()
        
        while (n > 1){
            if (n % 2 == 0L) {
                n /= 2
            } else {
                n = n * 3 + 1
            }
            answer ++
            if (answer > 500) break
        }
        return if (answer < 501) answer else -1
    }
}