fun main() {
    val result = StringBuilder()
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val parent = IntArray(n + 1)

        repeat(n - 1) {
            val (p, c) = readln().split(" ").map { it.toInt() }
            parent[c] = p
        }

        var (a, b) = readln().split(" ").map { it.toInt() }

        val visited = BooleanArray(n + 1)
        while (a != 0) {
            visited[a] = true
            a = parent[a]
        }

        while (b != 0) {
            if (visited[b]) {
                result.append(b).append("\n")
                break
            }
            b = parent[b]
        }
    }
    print(result)
}