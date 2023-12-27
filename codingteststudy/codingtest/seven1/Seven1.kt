package com.example.codingteststudy.codingtest.seven1

// 17. 자연수 뒤집어 배열로 만들기
class Solution {
    fun solution(n: Long): IntArray =n.toString().reversed().map{e->e.toString().toInt()}.toIntArray()
}