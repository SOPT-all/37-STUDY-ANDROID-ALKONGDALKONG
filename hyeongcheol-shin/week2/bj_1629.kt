
fun main() {
    val st = readln().split(" ").map{it.toLong()}
    val A = st[0]
    val B = st[1]
    val C = st[2]

    // (A^B) % C
    println(multiplication(A, B, C))
}

fun multiplication(a: Long, b: Long, c: Long): Long {
    if (b == 1L) return a % c
    if (b == 0L) return 1L

    val half = multiplication(a, b / 2, c)

    val result = (half * half) % c

    return if (b % 2 == 1L) {
        (result * a) % c
    } else {
        result
    }
}