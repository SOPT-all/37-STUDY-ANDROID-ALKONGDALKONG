class Solution {
    fun solution(s: String): IntArray {
        val answer = IntArray(s.length) {-1}
        val checkIndex = ('a'..'z').associate { it to -1 } as HashMap

        s.forEachIndexed { i, v ->
            if (checkIndex[v]!! > -1) answer[i] = (i - checkIndex[v]!!)
            checkIndex[v] = i
        }
        return answer
    }
}