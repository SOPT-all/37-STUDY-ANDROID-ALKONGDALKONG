class Solution {
    var answer = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val visited = BooleanArray(dungeons.size) { false }
        dfs(k, dungeons, visited, 0)
        return answer
    }

    private fun dfs(k: Int, dungeons: Array<IntArray>, visited: BooleanArray, count: Int) {
        answer = maxOf(answer, count)

        for (i in dungeons.indices) {
            val need = dungeons[i][0]
            val cost = dungeons[i][1]

            if (!visited[i] && k >= need) {
                visited[i] = true
                dfs(k - cost, dungeons, visited, count + 1)
                visited[i] = false
            }
        }
    }
}
