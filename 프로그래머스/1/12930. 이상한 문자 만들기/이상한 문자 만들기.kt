class Solution {
    fun solution(s: String): String {
        return s.split(" ")
            .joinToString(" ") { w ->
                w.mapIndexed { index, c ->
                    if (index % 2 == 0) c.uppercase() else c.lowercase()
                }.joinToString("")
            }
    }
}