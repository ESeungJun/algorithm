package programmers.lv1

class Solution87389 {
    fun solution(n: Int): Int {
        var num = 1
        while (true) {
            if (n % num == 1) break
            num++
        }
        return num
    }
}