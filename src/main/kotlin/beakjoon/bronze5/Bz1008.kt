package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/1008
 *
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * [출력]
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 * 10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
 */
class Bz1008 {

    /**
     * 이 문제는 toFloat()를 사용해서 틀렸는데 그 이유는 float형의 경우 무한소수(나누어 떨어지지 않는 값)에 대해서
     * 가장 가까운 근사치값으로 표현시킨다. 즉, 오차가 발생할 수 있는 범위가 존재한다.
     * 따라서 보다 더 정확한 소수점 값을 원한다면 double 형으로 쓰는것이 좋다
     */
    fun division(inputA: Int, inputB: Int) {
        println("${inputA / inputB.toDouble()}")
    }
}

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputA = scanner.nextInt()
    val inputB = scanner.nextInt()

    val divisionResult = Bz1008()
    divisionResult.division(inputA, inputB)
}