package programmers.lv1

class Solution12947 {
    fun solution(x: Int): Boolean {
        var result = 0
        x.toString().forEach { result += it.digitToInt() }
        return x % result == 0
    }
}


fun main() {
    val test = Solution12947()
    println("${test.solution(12)}")
}