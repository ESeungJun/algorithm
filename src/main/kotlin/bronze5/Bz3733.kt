package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/3733
 *
 * [Q]
 * A group of N persons and the ACM Chief Judge share equally a number of S shares (not necessary all of them).
 * Let x be the number of shares aquired by each person (x must be an integer).
 * The problem is to compute the maximum value of x.
 * Write a program that reads pairs of integer numbers from an input text file.
 * Each pair contains the values of 1 ≤ N ≤ 10000 and 1 ≤ S ≤ 109 in that order.
 * The input data are separated freely by white spaces, are correct, and terminate with an end of file.
 * For each pair of numbers the program computes the maximum value of x and prints that value on the standard output from the beginning of a line,
 * as shown in the example below.
 *
 * N명의 사람과 ACM 심사위원장이 S개의 주식을 똑같이 분배합니다. (모두 분배할 필요는 없습니다.)
 * x는 각 사람이 받는 주식의 수입니다. (x는 정수여야 합니다.) x의 최댓값을 계산합시다.
 * 입력 파일에서 정수 쌍을 읽는 프로그램을 작성합시다.
 * 각 쌍의 값은 순서대로 1 <= N <= 10000과 1 <= S <= 109입니다.
 * 항상 정당한 값이 들어오는 입력은 공백으로 나누어져 있으며 EOF로 종료됩니다.
 * 프로그램은 각 숫자 쌍에 대해 x의 최댓값을 계산한 후, 아래 예시와 같이 표준 출력 줄 시작에 그 값을 출력합니다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val resultList = arrayListOf<Int>()
    // EOF 로 종료한다는 것은 입력값에 모든 입력 이후 null이 입력된다는 뜻
    while (scanner.hasNextInt()) {
        val inputN = scanner.nextInt()
        val inputS = scanner.nextInt()
        resultList.add(inputS / (inputN + 1))
    }

    resultList.forEach { println(it) }
}