class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = mutableListOf<Int>()
        for (i in arr){
            if (stk.isEmpty() || i > stk.last()){
                stk.add(i)
            } else {
                while (stk.isNotEmpty() && i <= stk.last()) {
                    stk.removeAt(stk.size - 1) 
                }
                stk.add(i)
            }
        }
        return stk.toIntArray()
    }    
}