class Solution {
    fun solution(my_string: String): String = my_string.lowercase().split("").sorted().joinToString("")
}