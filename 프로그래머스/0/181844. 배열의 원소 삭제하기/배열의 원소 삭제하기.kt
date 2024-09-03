class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer = arr.toMutableList()
        for (i in 0 until arr.size){
            for (j in 0 until delete_list.size){
                if(arr[i] == delete_list[j]){
                    answer.remove(arr[i])
                }
            }
        }
        return answer.toIntArray()
    }
}