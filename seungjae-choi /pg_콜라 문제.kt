class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        fun solve(current: Int): Int {
            if (current < a) return 0
            
            val get = (current/a) * b
            val rem = current % a
            
            return get + solve(rem + get)
        }
        return solve(n)
    }
}
