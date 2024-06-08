class Solution {
    fun solution(names: Array<String>) = names.slice(0 until names.size step 5).toTypedArray()
}