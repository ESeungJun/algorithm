package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/4101
 *
 * [Q]
 * 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
 *
 * [In]
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 두 정수가 주어진다. 두 수는 백만보다 작거나 같은 양의 정수이다. 입력의 마지막 줄에는 0이 두 개 주어진다.
 *
 * [out]
 * 각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를, 아니면 No를 한 줄에 하나씩 출력한다.
 */

fun main() {
    val scanner = Scanner(System.`in`)
    val resultList = arrayListOf<String>()
    while (true) {
        val inputA = scanner.nextInt()
        val inputB = scanner.nextInt()

        if (inputA == 0 && inputB == 0) {
            break
        }

        resultList.add(if (inputA > inputB) "Yes" else "No")
    }

    resultList.forEach { println(it) }
}