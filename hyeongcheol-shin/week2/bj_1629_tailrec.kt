import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val A = st.nextToken().toLong()
    val B = st.nextToken().toLong()
    val C = st.nextToken().toLong()

    println(powTailrec(A, B, C, 1L))
}

// 꼬리 재귀 함수
tailrec fun multiplication(base: Long, exp: Long, mod: Long, acc: Long): Long {
    if (exp == 0L) return acc

    return if (exp % 2 == 1L) {
        multiplication(base, exp - 1, mod, (acc * base) % mod)
    } else {
        multiplication((base * base) % mod, exp / 2, mod, acc)
    }
}