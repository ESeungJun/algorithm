package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/5522
 *
 * [Q]
 * JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
 * JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.
 *
 * [I]
 * 표준 입력에서 다음과 같은 데이터를 읽어온다.
 *  i 번째 줄(1 ≤ i ≤ 5)에는 정수 Ai가 적혀있다. 이것은 i번째 게임에서의 JOI군의 점수를 나타낸다.
 *
 * [OUt]
 * 표준 출력에 JOI군의 총점을 한 줄로 출력하라.
 *
 */
fun main() {
    val scanner = Scanner(System.`in`)

    var totalSum = 0
    var index = 0
    while (scanner.hasNextInt() || index < 5) {
        totalSum += scanner.nextInt()
        index++
    }

    println("$totalSum")
}