package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/10869
 *
 * [q]
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println("${a + b}\n" +
            "${a - b}\n" +
            "${a * b}\n" +
            "${a / b}\n" +
            "${a % b}")
}