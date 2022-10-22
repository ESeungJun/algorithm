package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/8393
 *
 * [q]
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * [I]
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * [out]
 * 1부터 n까지 합을 출력한다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val maxNum = scanner.nextInt()
    var total = 0
    for (i in 1..maxNum) {
        total += i
    }
    println(total)
}