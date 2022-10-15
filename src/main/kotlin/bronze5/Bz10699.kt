package bronze5

import java.text.SimpleDateFormat
import java.util.Date

/**
 * https://www.acmicpc.net/problem/10699
 *
 * [q]
 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 *
 * [o]
 * 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 */

fun main() {
    println(SimpleDateFormat("YYYY-MM-dd").format(Date().time))
}