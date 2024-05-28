class Solution {
    fun solution(num_list: IntArray): Int {
        var a = num_list.filterIndexed { index, _ -> index % 2 == 0}.sum()
        var b = num_list.filterIndexed { index, _ -> index % 2 == 1}.sum()
        
        return if( a >= b ) a else b     
    }
}