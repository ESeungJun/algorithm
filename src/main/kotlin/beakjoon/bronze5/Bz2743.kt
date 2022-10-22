package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2743
 *
 * [Q]
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 *
 * [In]
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 *
 * [Out]
 * 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 */
fun main() {
    val scanner = Scanner(System.`in`)

    val inputStr = scanner.nextLine()
    println("${inputStr.length}")
}