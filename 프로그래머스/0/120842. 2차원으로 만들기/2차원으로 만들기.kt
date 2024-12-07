class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var list = num_list.toList().chunked(n)
        val result = list.map { it.toIntArray() }.toTypedArray()
        return result
    }
}

// 아니면 이러한 방법도 있다.
// return Array(list.size) {list[it].toIntArray()}
// Array 생성자를 만들고 그 안에 list 컬렉션의 크기를 반환하여 생성할 배열의 크기를 결정하고
// 람다함수를 통해 it(0부터 list.size -1)의 요소를 가지고 와서 정수형 배열로 변환하는 IntArray를 사용한다.