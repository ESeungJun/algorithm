package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/8871
 *
 * [q]
 * 한 번 SKI'10 대회가 n개의 스코어 라운드와 한 개의 시범 라운드로 구성되어있다 생각해 봅시다. n개의 스코어 라운드에 2~3개의 문제가 주어진다면, 대회에 총 몇 개의 문제가 주어질 수 있습니까?
 *
 * [I]
 * 오직 한 개의 줄에 자연수 n이 주어집니다. (1 <= n <= 1000)
 *
 * [out]
 * 당신의 프로그램은 두 개의 숫자를 하나의 공백으로 구분해 출력합니다.
 * 첫 번째 숫자는 SKI'10 n개의 스코어 라운드와 하나의 연습 라운드에서 주어질 수 있는 문제의 수의 최솟값입니다.
 * 두 번째 숫자는 이 대회에서 주어질 수 있는 문제의 수의 최댓값입니다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val roundN = scanner.nextInt()
    println("${roundN * 2 + 2} ${roundN * 3 + 3}")
}