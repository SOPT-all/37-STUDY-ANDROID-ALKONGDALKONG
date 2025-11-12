class Solution {
    fun solution(n: Int): Int {
        val nString = n.toString()
        val sumOfDigits = nString.map { it.digitToInt() }.sum()

        return sumOfDigits
    }
}