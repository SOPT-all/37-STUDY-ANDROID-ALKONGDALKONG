class Solution {
    fun solution(arr: Array<String>): String {

        val answer = StringBuilder()
        arr.forEach{ str ->
            answer.append(str)
        }
        return answer.toString()
    }
}
