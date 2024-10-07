class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        numbers.sort()
        
        var a = numbers[0] * numbers[1]
        var b = numbers[numbers.size - 1] * numbers[numbers.size - 2]
        
        return if (a > b){
            a
        } else {
            b
        }
    }
}