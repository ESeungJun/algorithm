package programmers.lv1

/**
 * 리스트에 대한걸 하나의 문자열로 표현할때는 String() 을 활용하면 된다
 * 기억해둘것
 */
class Solution12917 {
    // 내가한거 평균 대충 25ms 정도
    fun solution(s: String): String {
        return s.toCharArray().map { it.code }
            .sortedDescending()
            .joinToString(separator = "") { "${it.toChar()}" }
    }

    // 이 코드는 평균 대충 15ms 정도
    fun solutionOther(s: String): String {
        return String(s.toCharArray().sortedArrayDescending())
    }
}
