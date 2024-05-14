class Solution {
    fun solution(n: Int, k: Int): Int {
        val food = 12000*n
        val drink = 2000*k
        var answer: Int = food + drink - (n/10 * 2000)
        
        return answer
    }
}