package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/8370
 *
 * [q]
 * 바이트 항공은 최근 새 항공기 모델을 항공기 라인에 추가했다. 새 모델은 비즈니스석에 n1개의 열, 이코노미석에 n2개의 열이 있다. 또한 비즈니스석 각 열에는 k1개의 좌석이 있고,
 * 이코노미석 각 열에는 k2개의 좌석이 있다. 당신은 아래의 과정을 만족하는 프로그램을 작성해야 한다.
 * - 비행기의 좌석에 대한 정보를 읽는다.
 * - 그 비행기에 있는 좌석의 총 수를 계산한다.
 * - 그 결과를 출력한다.
 *
 * [i]
 * 오직 하나의 줄에 n1, k1, n2, k2 (1 <= n1, k1, n2, k2 <= 1000)가 공백 하나를 간격으로 주어진다.
 *
 * [out]
 * 오직 하나의 줄에 정수 하나 - 비행기에 있는 좌석의 총 수 - 를 출력하라.
 *
 */

fun main() {
    val scanner = Scanner(System.`in`)
    println("${(scanner.nextInt() * scanner.nextInt()) + (scanner.nextInt() * scanner.nextInt())}")
}