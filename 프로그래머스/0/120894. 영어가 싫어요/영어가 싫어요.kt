class Solution {
    fun solution(numbers: String): Long {
        var answer = numbers
            .replace("zero", "0")
            .replace("one", "1")
            .replace("two", "2")
            .replace("three", "3")
            .replace("four", "4")
            .replace("five", "5")
            .replace("six", "6")
            .replace("seven", "7")
            .replace("eight", "8")
            .replace("nine", "9")

        return answer.toLong()
    }
    // 좀 더 줄일수 있는 방법 고안
}