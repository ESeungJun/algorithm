package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2754
 *
 * [Q]
 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
 * A+: 4.3, A0: 4.0, A-: 3.7
 * B+: 3.3, B0: 3.0, B-: 2.7
 * C+: 2.3, C0: 2.0, C-: 1.7
 * D+: 1.3, D0: 1.0, D-: 0.7
 * F: 0.0
 *
 * [In]
 * 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.
 *
 * [Out]
 * 첫째 줄에 C언어 평점을 출력한다.
 */
class Bz2754 {
    fun checkSecondValue(value: Char): Double {
        return when (value) {
            '+' -> 0.3
            '-' -> -0.3
            else -> 0.0
        }
    }
}

/**
 * 데이터를 풀셋팅해서 가지고 있는 것보단 좀 더 유연하게 코드를 가져갈 수 있도록
 * 기준이 될 수 있는 값들만 선출(4.0) 그 뒤에 따라올 문자에 따른 가산 및 감산을 계산하도록 한다
 */
fun main() {
    val scanner = Scanner(System.`in`)

    val inputPoint = scanner.nextLine()

    val bz2754 = Bz2754()
    val result = when (inputPoint[0].uppercase()) {
        "A" -> 4.0 + bz2754.checkSecondValue(inputPoint[1])
        "B" -> 3.0 + bz2754.checkSecondValue(inputPoint[1])
        "C" -> 2.0 + bz2754.checkSecondValue(inputPoint[1])
        "D" -> 1.0 + bz2754.checkSecondValue(inputPoint[1])
        else -> 0.0
    }
    println(result)
}