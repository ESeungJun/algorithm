package beakjoon.bronze5

import java.util.Scanner
import kotlin.math.abs

/**
 * https://www.acmicpc.net/problem/18301
 *
 * [q]
 * 쥐의 해 설날을 축하하기 위해, 더글라스는 그의 집에 사는 쥐의 수를 세어보기로 했습니다.
 * 쥐는 워낙 잘 숨기 때문에, 그가 모든 쥐를 찾기란 불가능합니다. 그러나 새해 첫 날, 더글라스는 n1마리의 쥐를 잡고 놓아주기 전 그들의 귀에 표식을 남기는 데에 성공했습니다.
 * 새해 둘째 날, 더글라스는 또 n2마리의 쥐를 잡았는데, 그중 n12마리가 첫 날에 이미 표식을 남겼던 쥐라는 걸 발견했습니다.
 *
 * 더글라스는 그의 집에 사는 쥐의 총 수를 추정하기 위해 당신에게 도움을 요청합니다. 통계학 교과서를 뒤져보고, 당신은 아래의 채프만 추정값 N을 사용하기로 제안합니다.
 * N = ⌊(n1 + 1)(n2 + 1)/(n12 + 1) - 1⌋
 * ⌊x⌋는 x의 내림값, 즉, x 이하의 수 중 x와 가장 가까운 정수를 의미합니다.
 *
 * [o]
 * N 을 출력하시오
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n12 = scanner.nextInt()

    println("${abs(((n1 + 1) * (n2 + 1) / (n12 + 1) - 1))}")
}