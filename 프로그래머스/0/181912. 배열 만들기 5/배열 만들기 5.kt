class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for (i in intStrs){
            val j = i.substring(s, s + l).toInt()
                if (j > k) {
                    answer.add(j)
                }
        }
        return answer.toIntArray() 
    }
}