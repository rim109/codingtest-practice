class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return if (ineq == ">" && eq == "="){
            if (n >= m ) 1 else 0 
        } else if (ineq == "<" && eq == "="){
            if (n <= m ) 1 else 0 
        } else if (ineq == ">" && eq == "!"){
            if (n > m ) 1 else 0 
        } else {
            if (n < m ) 1 else 0 
        }
    }
}