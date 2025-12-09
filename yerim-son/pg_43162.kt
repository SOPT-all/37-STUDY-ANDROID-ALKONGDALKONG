// 3주차 - DFS/BFS
// 네크워크

class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(n)
        
        fun dfs(node: Int) {
            visited[node] = true
            for (i in 0 until n) {
                if (!visited[i] && computers[node][i] == 1) {
                    dfs(i)
                }
            }
        }
        
        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(i)
                answer++
            }
        }
         
        return answer
    }
}
