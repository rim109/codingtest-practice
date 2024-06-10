class Solution {
    fun solution(num: Int, k: Int): Int {
        var n = num.toString()
        var kn = k.toString()
        var answer: Int = 0
        if (n.contains(kn)){
            answer += n.indexOf(kn) + 1
        }else {
            answer = -1
        }
        return answer
    }
}