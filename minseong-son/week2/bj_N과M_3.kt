import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

private val sb = StringBuilder()

fun generate(n: Int, m: Int, depth: Int, arr: IntArray) {
    if (depth == m) {
        for (i in 0 until m) {
            sb.append(arr[i]).append(' ')
        }
        sb.append('\n')
        return
    }

    for (i in 1..n) {
        arr[depth] = i
        generate(n, m, depth + 1, arr)
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val arr = IntArray(m)

    generate(n, m, 0, arr)

    print(sb)
}
