package bronze5

import java.util.*

/**
 * https://www.acmicpc.net/problem/10872
 *
 * [q]
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 *
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()

    if (a < 2) {
        println(1)
        return
    }

    var result = 1
    for (i in a downTo 1) {
        result *= i
    }
    println(result)
}