class Solution {
    fun solution(str1: String, str2: String): String {
        var sb = StringBuilder()
        // 둘 중에 큰 수가 반환
        val lengths = Math.max(str1.length, str2.length)
        
        for (i in 0 until lengths){
            if (i < str1.length){
                sb.append(str1[i])
            }
            if (i < str2.length){
                sb.append(str2[i])
            }
        }
        return sb.toString()
    }
}