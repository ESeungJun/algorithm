package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/1001
 *
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
class Bz1001 {
    fun minus(inputA: Int, inputB: Int) {
        println("${inputA - inputB}")
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputA = scanner.nextInt()
    val inputB = scanner.nextInt()

    val minusResult = Bz1001()
    minusResult.minus(inputA, inputB)
}