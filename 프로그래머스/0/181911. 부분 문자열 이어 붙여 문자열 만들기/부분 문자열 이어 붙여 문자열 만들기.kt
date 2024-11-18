class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for (i in 0 until my_strings.size){
            val str = my_strings[i]
            answer += str.substring(parts[i][0], parts[i][1]+1)
        }
        return answer
    }
}