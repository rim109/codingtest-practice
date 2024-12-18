class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 10 downTo 1){
            if (factorial(i) <= n){
                answer = i
                break
            }
        }
        return answer
    }
    
    private fun factorial(n: Int): Int {
        return if (n == 1) 1
        else n * factorial(n - 1)
    }
}