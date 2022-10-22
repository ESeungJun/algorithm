package programmers.lv1

fun solution(num: Int): Int {
    var count = 0
    var result = num.toLong()
    while (count <= 500) {
        if (result == 1L) {
            break
        }
        result = if (result % 2 == 0L) {
            result / 2
        } else {
            result * 3 + 1
        }
        count++
    }
    return if (count >= 500) -1 else count
}

fun solution2(num: Int): Int = collatzAlgorithm(num.toLong(),0)

//재귀호출 코드는 사라지고 일반 반복문으로 변경되면서 콜 스택 생성에 따른 성능저하나, stack overflow 문제로부터 자유로워질 수 있습니다.
tailrec fun collatzAlgorithm(n:Long, c:Int): Int =
    when{
        c > 500 -> -1
        n == 1L -> c
        else -> collatzAlgorithm(if (n%2 == 0L) n/2 else (n*3)+1, c+1)
    }

fun main() {
    solution2(626331)
}