class Solution {
    fun solution(n: Int): String {
        val su = "수"
        val bak = "박"
        
        val stringBuilder = StringBuilder()
        for ( i in 0 until n){
            if (i % 2 == 0){
                stringBuilder.append(su)
            } else {
                stringBuilder.append(bak)
            }     
        }
        
        return stringBuilder.toString()
    }
}