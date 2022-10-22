package programmers.lv1

fun solution(x: Int, n: Int): LongArray {
    val answer = LongArray(n)
    var result = x.toLong()
    answer.forEachIndexed { index, l ->
        answer[index] = result
        result += x
    }
    return answer
}