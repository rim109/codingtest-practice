class Solution {
    fun solution(num_list: IntArray): Int {
        var sum = num_list.sum()
        var mul = num_list.fold(1) { acc, i -> acc * i }
        return if (sum * sum > mul) 1 else 0
         
    }
}