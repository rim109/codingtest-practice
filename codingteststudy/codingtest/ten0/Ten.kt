package com.example.codingteststudy.codingtest.ten0

//배열의 평균값
class Solution {
    fun solution(numbers: IntArray): Double {

        var sum = 0
        for(i in numbers){
            sum += i
        }

        return sum.toDouble() / numbers.size
    }
}