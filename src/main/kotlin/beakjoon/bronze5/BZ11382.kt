package beakjoon.bronze5

import java.util.*

/**
 * https://www.acmicpc.net/problem/11382
 *
 * [q]
 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 *
 * [i]
 * A+B+C의 값을 출력한다.
 *
 */

fun main() {
    val scanner = Scanner(System.`in`)
    println(scanner.nextBigInteger() + scanner.nextBigInteger() + scanner.nextBigInteger())
}