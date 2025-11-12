// 등차수열의 특정한 항만 더하기

class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        
        for (i in 0 until included.size) {
            if (included[i]) {
                answer += a + d * i
            }
        }
        
        return answer
    }
}
