package programmers.lv1

class Solution82612 {
    fun solution(price: Int, money: Int, count: Int): Long {
        var totalMoney = 0L
        for (i in 1..count) {
            totalMoney += (price * i)
        }
        return if (money > totalMoney) {
            0
        } else {
            totalMoney - money
        }
    }
}