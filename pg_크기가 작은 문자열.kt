// https://school.programmers.co.kr/learn/courses/30/lessons/147355
// 크기가 작은 문자열 

class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var pLen = p.length
        var tLen = t.length
        var pValue = p.toLong()
        
        for(i in 0 .. tLen - pLen){
            var part = t.substring(i, i+pLen).toLong()
            if(part <= pValue) answer++
        }
        
        return answer
    }
}
