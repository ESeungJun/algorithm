package programmers.lv1

class Solution70128 {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b) { dataA, dataB -> dataA * dataB }.sum()
    }
}