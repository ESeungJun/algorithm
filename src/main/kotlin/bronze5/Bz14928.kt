package bronze5

import java.util.Scanner


/**
 * https://www.acmicpc.net/problem/14928
 *
 * [q]
 * 제연이는 그의 생일(2000년 3월 3일)을 기념해 자신이 가장 좋아하는 수를 20000303으로 나눈 나머지를 구해 그 수만큼 잠을 자기로 했다. 제연이가 얼마나 잠을 잘 수 있을지 구하자.
 *
 * [o]
 * N을 20000303으로 나눈 나머지를 출력한다.
 *
 */
fun main() {
    val scanner = Scanner(System.`in`)
    // 이 코드는 시간초과
    //println(scanner.nextBigInteger().mod(BigInteger.valueOf(20000303)))

    val n = scanner.next()
    var remain = 0;
    for (a in n.indices){
        remain = (remain * 10 + (n[a].code - '0'.code)) % 20000303;
    }
    println(remain)

    /*
    어떤 수 a를 m으로 나눈 나머지가 r이라는 말을 수학적으로 엄밀하게 쓰면,
    a = mq + r, 0 <= r < m 을 만족하는 정수 q와 r이 유일하게 존재한다는 뜻입니다.

    이제 두 수 a와 b가 있고, a를 m으로 나눈 나머지가 r1, b를 m으로 나눈 나머지가 r2라 합시다.
    그러면 a = mq1 + r1, b = mq2 + r2라고 쓸 수 있습니다.
    a + b = mq1 + r1 + mq2 + r2 = m(q1 + q2) + (r1 + r2)가 됨을 알 수 있습니다.
    r1 + r2를 m으로 나눈 나머지를 r3라 하면, 이제 식을 이렇게 정리할 수 있습니다.
    a + b = m(q1 + q2) + mq3 + r3 = m(q1 + q2 + q3) + r3
    따라서 a + b를 m으로 나눈 나머지도 r3임을 알 수 있습니다.
    그래서 a + b를 m으로 나눈 나머지는 a를 m으로 나눈 나머지 (r1) 과 b를 m으로 나눈 나머지 (r2)를 더해서 m으로 나눈 나머지와 같다는 것을 알 수 있습니다.
     */
}