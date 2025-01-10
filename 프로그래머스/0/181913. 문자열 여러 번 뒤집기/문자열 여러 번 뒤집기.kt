class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer = StringBuilder(my_string)
        
        for (q in queries){
            val start = q[0]
            val end = q[1]
            val substring = answer.substring(start, end + 1).reversed() 
            answer.replace(start, end + 1, substring)
        }
        
        return answer.toString()
    }
}