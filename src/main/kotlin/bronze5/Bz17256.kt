package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/17256
 *
 * [q]
 * a 🍰 b = (a.z + b.x, a.y × b.y, a.x + b.z)
 * a 🍰 b = c
 * 케이크 수 a, b에 대하여, a = b라는 것은 다음과 같다.
 * a.x = b.x, a.y = b.y 그리고 a.z = b.z를 동시에 만족한다.
 *
 * [i]
 * 첫째 줄에 케이크 수 a를 구성하는 자연수 a.x, a.y, a.z 가 차례대로 주어진다. (1 ≤ a.x, a.y, a.z ≤ 100)
 * 둘째 줄에 케이크 수 c를 구성하는 자연수 c.x, c.y, c.z 가 차례대로 주어진다. (1 ≤ c.x, c.y, c.z ≤ 100)
 *
 * [o]
 * 문제의 조건을 만족하는 b.x, b.y, b.z를 하나의 공백을 사이에 두고 차례대로 출력한다.
 * b는 1 ≤ b.x, b.y, b.z ≤ 100 이고 반드시 유일하게 존재한다.
 *
 * 15 16 17
 * 19 32 90
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val aList = IntArray(3)
    for (i in 0 until 3) {
        aList[i] = scanner.nextInt()
    }

    val cList = IntArray(3)
    for (i in 0 until 3) {
        cList[i] = scanner.nextInt()
    }

    val bList = IntArray(3)
    bList[0] = cList[0] - aList[2]
    bList[1] = cList[1] / aList[1]
    bList[2] = cList[2] - aList[0]

    println("${bList[0]} ${bList[1]} ${bList[2]}")
}