package programmers.lv1

class Solution12948 {
    fun solution(phoneNumber: String): String {
        val changeNum = phoneNumber.substring(0, phoneNumber.length - 4).replace(Regex("[0-9]"), "*")
        return changeNum + phoneNumber.substring(phoneNumber.length - 4, phoneNumber.length)
    }
}