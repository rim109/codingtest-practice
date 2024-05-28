class Solution {
    fun solution(num_list: IntArray): Int {
        val a = num_list.filter { it % 2 == 0 }.joinToString("").toInt()
        val b = num_list.filter { it % 2 == 1 }.joinToString("").toInt()
        return a + b
    }
}