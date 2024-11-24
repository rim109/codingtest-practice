class Solution {
    fun solution(arr: IntArray): IntArray {
        var firstIndex = Int.MAX_VALUE
        var lastIndex = Int.MIN_VALUE
        
        for (i in arr.indices){
            if (arr[i] == 2){
                firstIndex = Math.min(firstIndex, i)
                lastIndex = Math.max(lastIndex, i)
                
            }
        }
        return if (firstIndex <= lastIndex) {
            arr.copyOfRange(firstIndex, lastIndex + 1)
        } else {
            intArrayOf(-1)
        }
    }
}