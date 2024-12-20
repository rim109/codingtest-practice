class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
       if (x1 || x2){
           if (x3 || x4){
               return true
           } else {
               return false
           }
       } else {
           return false
       }
    }
}