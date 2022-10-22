package beakjoon.bronze5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2738
 *
 * [문제]
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다.
 * 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
 * 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
 * N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 *
 * [출력]
 * 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 *
 */
class Bz2738 {
    /**
     * 다차원 배열에 대한 지식이 좀 부족함
     * 다차원 배열의 선언 방법이라던지 두 배열 간의 합을 구하는 공식을 좀 더 간략화 해봐야할듯 - 2022.9.27
     */
    fun resultSum(row: Int, column: Int, listA: Array<IntArray>, listB: Array<IntArray>) {
        val result = Array(row) { IntArray(column) { 0 } }
        for (i in 0 until row) {
            for (j in 0 until column) {
                result[i][j] = listA[i][j] + listB[i][j]
                print("${result[i][j]} ")
            }
            println()
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    val row = scanner.nextInt()
    val column = scanner.nextInt()

    // 코틀린에서의 다차원 배열 선언
    // Array(첫번째 배열의 전체 크기) { Array(두번째 배열의 전체 크기){ value } 두번째 배열 안에 들어갈 초기값 } ( 첫번째 배열 안에 들어갈 초기값)
    val listA = Array(row) { IntArray(column) { 0 } }
    for (i in 0 until row) {
        for (j in 0 until column) {
            listA[i][j] = scanner.nextInt()
        }
    }

    val listB = Array(row) { IntArray(column) { 0 } }
    for (i in 0 until row) {
        for (j in 0 until column) {
            listB[i][j] = scanner.nextInt()
        }
    }

    val bz2738 = Bz2738()
    bz2738.resultSum(row, column, listA, listB)
}