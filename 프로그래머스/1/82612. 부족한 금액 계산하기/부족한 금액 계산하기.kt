class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for (i in 1..count){
            answer += i * price
        } 
        var result = answer - money
        return if (result < 0){
            0
        } else {
            result
        }
    }
}