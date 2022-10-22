package programmers.lv1

fun solution(s: String): Int {
    return if (s.contains("-")) {
        -s.substring(1).toInt()
    } else {
        s.toInt()
    }
    /**
     * or
     * 이게 그냥 더 빠름
     * 음수 같은것도 알아서 변환해줌
     * fun solution(s: String): Int {
     *  return s.toInt()
     * }
     */
}