class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var st = StringBuilder()
       index_list.map {
           st.append(my_string[it])
       }
       return st.toString()
    }
}