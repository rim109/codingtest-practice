class Solution {
    fun solution(my_string: String): IntArray {
        return my_string
            .replace("[a-z]".toRegex(), "")
            .toList()
            .map { it.toString().toInt()}
            .sorted()
            .toIntArray()
    }
}