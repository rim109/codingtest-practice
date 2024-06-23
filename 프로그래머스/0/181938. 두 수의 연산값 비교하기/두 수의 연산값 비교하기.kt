class Solution {
    fun solution(a: Int, b: Int): Int {
        var ab = (a.toString() + b.toString()).toInt()
        return if (ab >= 2 * a * b) ab else 2 * a * b
        
    }
}