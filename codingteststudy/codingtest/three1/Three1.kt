package com.example.codingteststudy.codingtest.three1

// 13. 자릿수 더하기
class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var N = n
        while(N  != 0){
            answer += N % 10
            N /=10
        }
        return answer
    }
}