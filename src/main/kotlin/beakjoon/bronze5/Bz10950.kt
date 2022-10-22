package beakjoon.bronze5

import java.util.*

/**
 * https://www.acmicpc.net/problem/10950
 *
 * [q]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * [i]
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * [o]
 * 각 테스트 케이스마다 A+B를 출력한다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    val resultList = arrayListOf<Int>()
    for (i in 0 until count) {
        resultList.add(scanner.nextInt() + scanner.nextInt())
    }

    resultList.forEach { println(it) }
}