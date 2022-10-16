package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/20254
 *
 * [q]
 * 여러 대학의 팀이 ICPC World Finals 진출 티켓을 따내기 위해 ICPC 지역 대회에 참가합니다. 각 지역 대회에 배정된 진출 티켓의 수는 다양합니다.
 * 우리가 속한 아시아-태평양 지역의 배정 방식은, 지역 배정 점수라는 변수에 의존합니다.
 * 지역 배정 점수는 지역 대회나 그 예선 대회인 TOPC에서 최소 한 문제를 푼 팀과 그 소속 대학의 수만을 고려합니다.
 * 2020년 타이페이-신주 지역의 지역 배정 점수를 계산하는 방식은 이전보다 훨씬 간단합니다.
 * - UR은 지역 대회에서 최소 한 문제를 푼 대학의 수입니다.
 * - TR은 지역 대회에서 최소 한 문제를 푼 팀의 수입니다.
 * - UO는 TOPC에서 최소 한 문제를 푼 대학의 수입니다.
 * - TO는 TOPC에서 최소 한 문제를 푼 팀의 수입니다.
 *
 * 2020년 타이페이-신주 지역 대회의 지역 배정 점수는 56UR + 24TR + 14UO + 6TO입니다.
 *
 * 2020 타이페이-신주 지역 대회의 지역 배정 점수를 구하는 프로그램을 작성합시다.
 *
 * [i]
 * 한 줄에 공백을 기준으로 나뉜 네 정수 UR, TR, UO, TO가 주어집니다.
 *
 * [o]
 * 2020 타이페이-신주 지역 대회의 지역 배정 점수를 출력합니다.
 *
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val ur = scanner.nextInt()
    val tr = scanner.nextInt()
    val uo = scanner.nextInt()
    val to = scanner.nextInt()

    println("${(56 * ur) + (24 * tr) + (14 * uo) + (6 * to)}")
}