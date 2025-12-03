// 2주차 - 완전탐색
// 카펫

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        val total = brown + yellow
        
        for (height in 1..total) {
            var width = total / height
            if ((width - 2) * (height - 2) == yellow) {
                answer = intArrayOf(width, height)
                break
            }
        }
        
        return answer
    }
}
