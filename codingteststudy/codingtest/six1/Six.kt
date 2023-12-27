package com.example.codingteststudy.codingtest.six1

//16. x만큼 간격이 있는 n개의 숫자
class Solution {
    fun solution(x: Int, n: Int)= LongArray(n) {x.toLong() * (it + 1)}
}