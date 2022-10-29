package programmers.lv1

class Solution12910 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arr.sorted().filterTo(arrayListOf()) { it % divisor == 0 }
        if (answer.isEmpty()) {
            answer.add(-1)
        }
        return answer.toIntArray()
    }
}