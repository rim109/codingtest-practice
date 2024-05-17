class Solution {
    fun solution(a: Int, b: Int): Int {
        var ab = "$a$b"
        var ba = "$b$a"
        
        return if( ab.toInt() >= ba.toInt()){
            ab.toInt()
        } else ba.toInt()  
    }
}