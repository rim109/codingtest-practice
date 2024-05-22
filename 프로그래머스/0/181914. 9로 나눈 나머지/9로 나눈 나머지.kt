class Solution {
    fun solution(number: String): Int = number.sumOf { it.toString().toInt() } % 9 
}