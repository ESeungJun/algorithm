package programmers.lv1

import java.lang.Math.sqrt

class Solution77884 {
    // 평균 약 3ms
    fun solution(left: Int, right: Int): Int {
        return (left..right).fold(0){ acc, i ->
            val sqrtI = sqrt(i.toDouble()).toInt()
            val sqrtList = arrayListOf<Int>()
            for (a in 1..sqrtI) {
                if (i % a == 0) {
                    sqrtList.add(a)
                    val divValue = i / a
                    if (divValue != a) {
                        sqrtList.add(divValue)
                    }
                }
            }

            if (sqrtList.size % 2 == 0) {
                acc + i
            } else {
                acc - i
            }
        }
    }

    // 평균 약 3.9ms
    //https://yline.tistory.com/100 이해가 안됨... 근데 그냥 위에 케이스가 더 빠름
    // 어떤 케이스에서는 6~8ms가 넘어가는 경우가 있음
    fun solutionOther(left: Int, right: Int): Int {
        return (left..right).fold(0){ acc, i ->
            if(sqrt(i.toDouble()) % 1 == 0.0) {
                acc - i
            } else {
                acc + i
            }
        }
    }
}

fun main() {
    val test = Solution77884()
    test.solution(13, 16)
    test.solutionOther(13, 16)

}