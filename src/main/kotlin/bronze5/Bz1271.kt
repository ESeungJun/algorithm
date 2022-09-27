package bronze5

import java.math.BigInteger
import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/1271
 *
 * [문제]
 * 갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 그 돈을 나누자고 따진다.
 * 그 사실이 전 우주로 알려지자 우주에 있던 많은 생명체들이 자신들에게 돈을 분배해 달라고 당장 달려오기 시작했다.
 * 프로토스 중앙 우주 정부의 정책인, ‘모든 지적 생명체는 동등하다’라는 규칙에 입각해서 돈을 똑같이 분배하고자 한다.
 * 한 생명체에게 얼마씩 돈을 줄 수 있는가?
 * 또, 생명체들에게 동일하게 분배한 후 남는 돈은 얼마인가?
 *
 * [입력]
 * 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 10의 1000제곱, m과 n은 10진수 정수)
 *
 * [출력]
 * 첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
 */
class Bz1271 {
    /**
     * 해당 문제의 경우, InputMismatch 오류가 발생하였는데 입력되는 수가 매우 큰값이다.
     * 따라서, 일반적인 정수형으로는 표현이 불가하고 BigInteger 형태로 표현해야한다
     * int => -2'31 ~ 2'31-1
     * long => -2'63 ~ 22'63-1
     */
    fun divisionMoney(totalMoney: BigInteger, targetPeople: BigInteger) {
        println("${totalMoney.divide(targetPeople)}")
        println("${totalMoney.remainder(targetPeople)}")
    }
}

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputA = scanner.nextBigInteger()
    val inputB = scanner.nextBigInteger()

    val divisionResult = Bz1271()
    divisionResult.divisionMoney(inputA, inputB)
}