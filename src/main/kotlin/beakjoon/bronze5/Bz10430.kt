package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/10430
 *
 * [q]
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 *
 * [o]
 * 첫째 줄에 (A+B)%C,
 * 둘째 줄에 ((A%C) + (B%C))%C,
 * 셋째 줄에 (A×B)%C,
 * 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */
fun main() {
    val scanner = Scanner(System.`in`)

    val inputArray = IntArray(3)
    for (i in 0..2) {
        inputArray[i] = scanner.nextInt()
    }

    println("${(inputArray[0] + inputArray[1]) % inputArray[2]}")
    println("${((inputArray[0] % inputArray[2]) + (inputArray[1] % inputArray[2])) % inputArray[2]}")
    println("${(inputArray[0] * inputArray[1]) % inputArray[2]}")
    println("${((inputArray[0] % inputArray[2]) * (inputArray[1] % inputArray[2])) % inputArray[2]}")
}