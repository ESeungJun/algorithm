package bronze5

import java.util.*

/**
 * https://www.acmicpc.net/problem/11022
 *
 * [q]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * [o]
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    val resultList = arrayListOf<String>()
    for (i in 1..count) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        resultList.add("Case #$i: $a + $b = ${a+b}")
    }
    resultList.map { println(it) }
}