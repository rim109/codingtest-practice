class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        return when {
            arr1.size < arr2.size -> -1
            arr1.size > arr2.size -> 1
            else -> arr1.sum().compareTo(arr2.sum())
        }
    }
}