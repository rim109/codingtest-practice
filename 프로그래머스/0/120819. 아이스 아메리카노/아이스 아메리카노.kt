class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val n = money / 5500
        var change = money - (n * 5500)
        return intArrayOf(n, change)
    }
}