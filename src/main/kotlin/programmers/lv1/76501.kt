package programmers.lv1

class Solution76501 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        absolutes.forEachIndexed { index, i ->
            if (signs[index]) {
                answer += i
            } else {
                answer -= i
            }
        }
        return answer
    }
}