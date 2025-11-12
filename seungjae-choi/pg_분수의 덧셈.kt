class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var finalDenom = denom1 * denom2
        var finalNumer = numer1 * denom2 + numer2 * denom1
        val finalGcd = gcd(finalNumer, finalDenom)
        return intArrayOf(finalNumer/finalGcd, finalDenom/finalGcd)
    }
    private fun gcd(a: Int, b:Int): Int = if (b != 0) gcd(b, a % b) else a
}