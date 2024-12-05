class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        // copyOf은 원본 배열을 복사하여 결과를 저장 할 배열 생성
        var answer = arr.copyOf()
        for (i in queries){
            val first = i[0]
            val last = i[1]
            for (j in first..last){
                answer[j] += 1
            }
        }
        return answer
    }
}