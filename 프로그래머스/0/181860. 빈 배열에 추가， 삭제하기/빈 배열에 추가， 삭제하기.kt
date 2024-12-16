class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = arrayListOf<Int>()
        
        for (i in 0 until flag.size){
            if(flag[i] == true){
                repeat(arr[i] * 2) {
                    answer.add(arr[i])
                }
            } else {
                repeat(arr[i]) {
                    answer.removeLast()
                }
            }
        }
        return answer.toIntArray()
    }
}