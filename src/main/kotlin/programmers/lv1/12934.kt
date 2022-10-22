package programmers.lv1

import kotlin.math.sqrt

class Solution12934 {
    fun solution(n: Long): Long {
        val answer: Long = sqrt(n.toDouble()).toLong().takeIf { it > 0 && it * it == n }?.let {
            ((it + 1) * (it + 1))
        } ?: run {
            -1L
        }
        return answer
    }
}