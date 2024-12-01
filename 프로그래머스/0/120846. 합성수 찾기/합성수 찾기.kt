class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        // 약수는 뭐든 1부터 시작하므로 1부터 시작
        for (i in 1..n){
            var cnt = 0
            // j가 0일 때 i % j를 계산하면 나누기 0 오류가 발생하므로 1부터 시작
            for (j in 1..i){
                if (i % j == 0){
                    cnt++
                }
            }
            if (cnt >= 3) answer++           
        }
        return answer
    }
}