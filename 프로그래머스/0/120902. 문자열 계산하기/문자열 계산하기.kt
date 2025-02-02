class Solution {
    fun solution(my_string: String): Int {
        val s = my_string.split(" ".toRegex()).toTypedArray()
        var answer = s[0].toInt()
        var i = 1
        while (i < s.size) {
            if (s[i] == "+") {
                answer += s[i + 1].toInt()
            } else {
                answer -= s[i + 1].toInt()
            }
            i += 2
        }
        return answer
    }
}