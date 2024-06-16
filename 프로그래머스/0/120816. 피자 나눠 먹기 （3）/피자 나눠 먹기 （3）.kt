class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        while ( n > slice * answer){
            answer ++
        }
        return answer
    }
}