package programmers.lv1

class Solution12932 {
    fun solution(n: Long): IntArray {
        val strN = n.toString()
        val answer = IntArray(strN.length)
        strN.reversed().forEachIndexed { index, c -> answer[index] = c.digitToInt()  }
        return answer
    }
}