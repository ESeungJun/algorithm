package programmers.lv1

class Solution12950 {
    /**
     * 평균 5~ 6ms 심한건 26ms 까지
     */
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = mutableListOf<IntArray>()
        arr1.forEachIndexed { i, intList ->
            answer.add(intList.zip(arr2[i]) {x, y -> x + y}.toIntArray())
        }
        return answer.toTypedArray()
    }

    /**
     * 0.1ms 내외 길어봣자 4ms
     */
    fun solution2(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { row ->
            IntArray(arr1[0].size) { col ->
                arr1[row][col] + arr2[row][col]
            }
        }
    }
}