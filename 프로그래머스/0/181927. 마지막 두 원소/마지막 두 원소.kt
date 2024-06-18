class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.toMutableList()
        if (num_list[num_list.size - 1] > num_list[num_list.size  - 2]){
            answer.add(num_list[num_list.size - 1] - num_list[num_list.size  - 2])
        } else {
            answer.add(num_list[num_list.size - 1] * 2)
        }
        return answer.toIntArray()
    }
}