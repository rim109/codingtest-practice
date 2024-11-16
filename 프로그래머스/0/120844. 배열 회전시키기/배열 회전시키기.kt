class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer = IntArray(numbers.size)
        if (direction.equals("right")){
            for (i in numbers.indices){
                answer[(i + 1) % numbers.size] = numbers[i]
            }
        } else {
            for (i in numbers.indices){
                answer[(i - 1 + numbers.size) % numbers.size] = numbers[i]
            }
        }
        return answer
    }
}