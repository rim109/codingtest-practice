package com.example.codingteststudy.codingtest.five1

class Solution {
    fun solution(n: Int): Int {
        for (x in 2..n)
            if (n % x == 1){
                return x
            }
        return 0
    }
}