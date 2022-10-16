package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/16394
 *
 * [q]
 * 홍익대학교는 1946년에 개교하였다.
 * 특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val year = scanner.nextInt()
    println("${year - 1946}")
}