class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        
        for (height in 3..total) {
            if (total % height == 0) {
                val width = total / height
                if (width >= height) {
                    val yellowArea = (width - 2) * (height - 2)
                    
                    if (yellowArea == yellow) {
                        return intArrayOf(width, height)
                    }
                }
            }
        }
        
        return intArrayOf(0, 0)
    }
}