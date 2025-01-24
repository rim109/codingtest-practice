class Solution {
    fun solution(s: String): Int {
        val list = s.split(" ").toMutableList()
        var sum = 0
        while (list.contains("Z")) {
            list.removeAt(list.indexOf("Z") - 1)
            list.removeAt(list.indexOf("Z"))
        }
        for (i in list.indices) sum += list[i].toInt()
        return sum
    }
}