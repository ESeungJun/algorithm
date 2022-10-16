package bronze5

import java.util.Scanner


/**
 * https://www.acmicpc.net/problem/15964
 *
 * [q]
 *  A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
 *
 *  [o]
 *   첫째 줄에 A＠B의 결과를 출력한다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextBigInteger()
    val b = scanner.nextBigInteger()

    println("${(a+b)*(a-b)}")
}