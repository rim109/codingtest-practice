class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val result = my_str.chunked(n)
        return result.toTypedArray()
    }
    // List<String>이므로 반환값을 Array<String>로 바꾸기 위해선 toTypedArray()를 해주면 된다. 
}