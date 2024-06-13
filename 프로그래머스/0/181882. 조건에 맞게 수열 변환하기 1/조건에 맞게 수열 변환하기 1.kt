class Solution {
    fun solution(arr: IntArray): IntArray = arr.map { num ->
        when {
            num >= 50 && num % 2 == 0 -> num / 2
            num < 50 && num % 2 == 1 -> num * 2
            else -> num
        }
    }.toIntArray()
}