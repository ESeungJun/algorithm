package beakjoon.bronze5

import java.util.*

/**
 * https://www.acmicpc.net/problem/11021
 *
 * [q]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 *
 */
fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    val resultList = arrayListOf<Int>()
    for (i in 0 until count) {
        resultList.add(scanner.nextInt() + scanner.nextInt())
    }

    resultList.forEachIndexed { index, i -> println("Case #${index+1}: $i") }
}