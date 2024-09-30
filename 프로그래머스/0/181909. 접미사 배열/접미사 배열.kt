class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = Array(my_string.length){""}
        for (i in 0 until my_string.length){
            answer[i] = my_string.substring(my_string.length - i -1)
        }
        answer.sort()
        return answer
    }
}