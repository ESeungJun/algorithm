package programmers.lv1

class Solution12930 {
    fun solution(s: String): String {
        return s.split(" ").map { word ->
            word.mapIndexed { index, c ->
                if (index % 2 == 0) {
                    c.uppercase()
                } else {
                    c.lowercase()
                }
            }.joinToString("")
        }.reduce { acc, s ->  "$acc $s" }
    }
}