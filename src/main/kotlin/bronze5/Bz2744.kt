package bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2744
 *
 * [Q]
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 *
 * [In]
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 *
 * [Out]
 * 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val inputStr = scanner.nextLine()
    val strBuilder = StringBuilder()
    inputStr.forEach {
        strBuilder.append(if (it.isUpperCase()) {
            it.lowercase()
        } else {
            it.uppercase()
        })
    }
    println(strBuilder)
}