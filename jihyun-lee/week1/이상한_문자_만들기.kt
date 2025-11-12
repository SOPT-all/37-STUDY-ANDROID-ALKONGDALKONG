class Solution {
    fun solution(s: String): String {
        return s.split(" ").map { word ->
            word.mapIndexed { index, char ->
                if (index % 2 == 0) {
                    char.uppercase()
                } else {
                    char.lowercase()
                }
            }.joinToString("")
        }.joinToString(" ")
    }
}