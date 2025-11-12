class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(s.length) {-1}
        val reverseS = s.reversed()
        for((index, text) in s.withIndex()){
            for(i in index - 1 downTo 0){
                if(text == s[i]){
                    answer[index] = index - i
                    break
                }
            }
        }
        return answer
    }
}