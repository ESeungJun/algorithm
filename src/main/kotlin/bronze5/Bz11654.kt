package bronze5

import java.util.Scanner


/**
 * https://www.acmicpc.net/problem/11654
 *
 * [q]
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */
fun main() {
    val scanner = Scanner(System.`in`)
    println(scanner.next().first().code)
}