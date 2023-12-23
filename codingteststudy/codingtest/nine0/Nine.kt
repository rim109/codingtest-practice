package com.example.codingteststudy.codingtest.nine0

//짝수의 합
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for(i:Int in 1..n){
            if (i%2==0) {
                answer += i
            }
        }
        return answer
    }
}