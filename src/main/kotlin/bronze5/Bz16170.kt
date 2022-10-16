package bronze5

import java.text.SimpleDateFormat

/**
 * https://www.acmicpc.net/problem/16170
 *
 * [q]
 * 두 사람이 정확한 날짜에 모일 수 있도록 문제를 푸는 지금 시각이 UTC+0(세계 표준시)을 기준으로 무슨 날짜인지 출력해 주는 프로그램을 작성하자.
 *
 * [o]
 * 두 사람이 정확한 날짜에 모일 수 있도록 문제를 푸는 지금 시각이 UTC+0(세계 표준시)을 기준으로 무슨 날짜인지 출력해 주는 프로그램을 작성하자.
 */

fun main() {
    val dataFormat = SimpleDateFormat("YYYY-MM-dd")
    dataFormat.format(System.currentTimeMillis())
        .split("-")
        .map {
            println(it)
        }
}