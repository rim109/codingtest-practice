class Solution {
    fun solution(num_list: IntArray): IntArray {
        var a = num_list.count{it % 2 == 0}
        var b = num_list.count{it % 2 == 1}
      
        return intArrayOf(a,b)
    }
}