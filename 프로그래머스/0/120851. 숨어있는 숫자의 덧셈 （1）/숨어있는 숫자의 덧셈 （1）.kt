class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        val num = my_string.replace("[^0-9]".toRegex(),"")
        for (i in num){
            answer += i.toString().toInt()
        }
        return answer
    }
}