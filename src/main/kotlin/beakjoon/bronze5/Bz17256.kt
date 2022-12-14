package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/17256
 *
 * [q]
 * a ๐ฐ b = (a.z + b.x, a.y ร b.y, a.x + b.z)
 * a ๐ฐ b = c
 * ์ผ์ดํฌ ์ a, b์ ๋ํ์ฌ, a = b๋ผ๋ ๊ฒ์ ๋ค์๊ณผ ๊ฐ๋ค.
 * a.x = b.x, a.y = b.y ๊ทธ๋ฆฌ๊ณ  a.z = b.z๋ฅผ ๋์์ ๋ง์กฑํ๋ค.
 *
 * [i]
 * ์ฒซ์งธ ์ค์ ์ผ์ดํฌ ์ a๋ฅผ ๊ตฌ์ฑํ๋ ์์ฐ์ a.x, a.y, a.z ๊ฐ ์ฐจ๋ก๋๋ก ์ฃผ์ด์ง๋ค. (1 โค a.x, a.y, a.z โค 100)
 * ๋์งธ ์ค์ ์ผ์ดํฌ ์ c๋ฅผ ๊ตฌ์ฑํ๋ ์์ฐ์ c.x, c.y, c.z ๊ฐ ์ฐจ๋ก๋๋ก ์ฃผ์ด์ง๋ค. (1 โค c.x, c.y, c.z โค 100)
 *
 * [o]
 * ๋ฌธ์ ์ ์กฐ๊ฑด์ ๋ง์กฑํ๋ b.x, b.y, b.z๋ฅผ ํ๋์ ๊ณต๋ฐฑ์ ์ฌ์ด์ ๋๊ณ  ์ฐจ๋ก๋๋ก ์ถ๋ ฅํ๋ค.
 * b๋ 1 โค b.x, b.y, b.z โค 100 ์ด๊ณ  ๋ฐ๋์ ์ ์ผํ๊ฒ ์กด์ฌํ๋ค.
 *
 * 15 16 17
 * 19 32 90
 */

fun main() {
    val scanner = Scanner(System.`in`)

    val aList = IntArray(3)
    for (i in 0 until 3) {
        aList[i] = scanner.nextInt()
    }

    val cList = IntArray(3)
    for (i in 0 until 3) {
        cList[i] = scanner.nextInt()
    }

    val bList = IntArray(3)
    bList[0] = cList[0] - aList[2]
    bList[1] = cList[1] / aList[1]
    bList[2] = cList[2] - aList[0]

    println("${bList[0]} ${bList[1]} ${bList[2]}")
}