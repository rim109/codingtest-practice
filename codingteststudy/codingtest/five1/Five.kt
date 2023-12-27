package com.example.codingteststudy.codingtest.five1

//15. 나머지가 1이 되는 수 찾기
class Solution {
    fun solution(n: Int): Int {
        for (x in 2..n)
            if (n % x == 1){
                return x
            }
        return 0
    }
}