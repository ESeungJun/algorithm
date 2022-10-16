package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/15740
 *
 * [q]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * [i]
 * 첫째 줄에 A와 B (-10^10000 ≤ A, B ≤ 10^10000)가 주어진다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextBigInteger()
    val b = scanner.nextBigInteger()

    println(a.plus(b))
}