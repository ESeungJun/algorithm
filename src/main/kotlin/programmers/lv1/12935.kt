package programmers.lv1

class Solution12935 {
    fun solution(arr: IntArray): IntArray {
        val minValue = arr.minOf { it }
        val answer = arr.filter { it != minValue }.toIntArray()
        return if (answer.isEmpty()) intArrayOf(-1) else answer
    }
}