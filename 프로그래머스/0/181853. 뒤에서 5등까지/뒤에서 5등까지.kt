class Solution {
    fun solution(num_list: IntArray) = num_list.sorted().slice(0 until 5).toIntArray()
}