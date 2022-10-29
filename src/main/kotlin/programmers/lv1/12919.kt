package programmers.lv1

class Solution12919 {
    fun solution(seoul: Array<String>): String {
        return seoul.indexOfFirst { it == "Kim" }.run { "김서방은 ${this}에 있다" }
    }
}