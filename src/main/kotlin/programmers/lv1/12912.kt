package programmers.lv1

import kotlin.math.max
import kotlin.math.min

class Solution12912 {
    fun solution(a: Int, b: Int): Long {
        var answer = 0L
        if (a == b) {
            return a.toLong()
        }

        val max = max(a, b)
        val min = min(a, b)
        for (i in min..max) {
            answer += i
        }
        return answer
    }
}