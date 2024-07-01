class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        val answer = arr.copyOf() 
        for (i in arr.indices){
            if (arr.size % 2 == 1 && i % 2 == 0){
                answer[i] = arr[i] + n
            } else if (arr.size % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n
            } 
        }
        return answer
    }
}