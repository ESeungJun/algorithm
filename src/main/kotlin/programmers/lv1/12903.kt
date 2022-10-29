package programmers.lv1

class Solution12903 {
    fun solution(s: String): String {
        return if (s.length % 2 == 0) {
            if (s.length == 2) s else "${s[(s.length / 2) - 1]}${s[s.length / 2]}"
        } else {
            "${s[s.length / 2]}"
        }
    }
}