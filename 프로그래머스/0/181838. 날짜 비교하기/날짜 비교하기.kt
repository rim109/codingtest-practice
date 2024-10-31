import java.time.LocalDate

class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        val date1 = LocalDate.of(date1[0], date1[1], date1[2])
        val date2 = LocalDate.of(date2[0], date2[1], date2[2])
        val compareTo = date1.compareTo(date2)

        return if (compareTo < 0) 1 else 0
    }
}