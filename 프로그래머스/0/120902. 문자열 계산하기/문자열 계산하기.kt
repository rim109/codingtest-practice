class Solution {
    fun solution(my_string: String): Int {
        val stringArr = my_string.split(" ".toRegex()).toTypedArray()
        var answer = stringArr[0].toInt()
        var i = 1
        while (i < stringArr.size) {
            if (stringArr[i] == "+") {
                answer += stringArr[i + 1].toInt()
            } else {
                answer -= stringArr[i + 1].toInt()
            }
            i += 2
        }
        return answer
    }
}