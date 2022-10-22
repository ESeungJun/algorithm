package programmers.lv1

class Solution {
    fun solution(arr: IntArray): Double {
        return arr.reduce { result, data -> result + data }.div(arr.size.toDouble())
    }
}