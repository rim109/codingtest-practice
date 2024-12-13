class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right){
            var cnt: Int = 0
            // i가 right으로 돌리면 그게 최대 수니깐 아래 for문은 i까지이도록 작성
            for (j in 1..i){
                if (i % j == 0)
                cnt++ 
            }
            if (cnt % 2 == 0) answer += i
            else answer -= i
        }
        return answer
    }
}