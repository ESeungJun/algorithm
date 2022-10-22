package programmers.lv1

fun solution(n: Long): Long {
    return n.toString().map { it.digitToInt() }.sortedDescending()
        .toString().replace(Regex("[^0-9]"), "").trim().toLong()
}

/**
 * 위 로직보다 절반이하의 시간을 가지고있음
 */
fun solution2(n: Long): Long {
    return String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}