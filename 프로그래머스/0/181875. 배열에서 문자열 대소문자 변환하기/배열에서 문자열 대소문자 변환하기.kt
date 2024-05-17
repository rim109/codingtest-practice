class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        for(i in strArr.indices){
           strArr[i] = if(i % 2 == 0 ) strArr[i].lowercase() else strArr[i].uppercase()
        }
        return strArr
    }
}