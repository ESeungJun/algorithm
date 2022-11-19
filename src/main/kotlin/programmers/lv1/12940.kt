package programmers.lv1

import kotlin.math.max
import kotlin.math.min

class Solution12940 {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcm(n, m), ((n*m) / gcm(n,m)))
    }

    private tailrec fun gcm(a: Int, b: Int): Int {
        val maxValue = max(a, b)
        val minValue = min(a, b)

        return if (minValue == 0) {
            maxValue
        } else {
            gcm(minValue, maxValue % minValue)
        }
    }
}